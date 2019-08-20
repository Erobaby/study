package me.erobaby.study.netty.firstnetty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;

public class PacketCodeC {
    private static final int MAGIC = 0x12121212;

    public static PacketCodeC INSTANCE = new PacketCodeC();

    private PacketCodeC(){}

    public ByteBuf encode(Packet packet) {
        byte[] data = Serializer.DEFAULT.serial(packet);
        ByteBuf byteBuf = ByteBufAllocator.DEFAULT.ioBuffer();
        byteBuf.writeInt(MAGIC);
        byteBuf.writeByte(Packet.version);
        byteBuf.writeByte(Serializer.DEFAULT.getSerializerAlgorithm());
        byteBuf.writeByte(packet.getCommand());
        byteBuf.writeInt(data.length);
        byteBuf.writeBytes(data);
        return byteBuf;
    }

    public Packet decode(ByteBuf byteBuf) {
        int magic = byteBuf.readInt();
        byte version = byteBuf.readByte();
        byte serializerAlgorithm = byteBuf.readByte();
        byte command = byteBuf.readByte();
        int length = byteBuf.readInt();

        byte[] data = new byte[length];
        byteBuf.readBytes(data);
        Class<? extends Packet> clazz =  getRequestType(command);

        return Serializer.DEFAULT.deserial(data, clazz);
    }

    private Class<? extends Packet> getRequestType(byte command) {
        return LoginRequestPacket.class;
    }


}
