package me.erobaby.study.netty.firstnetty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.util.UUID;

public class ClientHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
//        super.channelActive(ctx);
        LoginRequestPacket loginRequestPacket = new LoginRequestPacket();
        loginRequestPacket.setUserId(UUID.randomUUID().toString());
        loginRequestPacket.setUsername("admin");
        loginRequestPacket.setPasword("admin123");
        ByteBuf byteBuf = PacketCodeC.INSTANCE.encode(loginRequestPacket);
        ctx.writeAndFlush(byteBuf);
    }
}
