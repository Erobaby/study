package me.erobaby.server;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import me.erobaby.pojo.LuckHeader;
import me.erobaby.pojo.LuckMessage;

import java.util.List;

/**
 * Created by erobaby on 2017/1/23.
 */
public class LuckDecoder extends ByteToMessageDecoder {
    protected void decode(ChannelHandlerContext ctx, ByteBuf byteBuf, List<Object> list) throws Exception {
        if (byteBuf.isReadable()) {
            LuckHeader header = new LuckHeader();
            LuckMessage message = new LuckMessage();
            header.setVersion(byteBuf.readInt());
            header.setContentLength(byteBuf.readInt());
            byte[] sessionBytes = new byte[36];
            byteBuf.readBytes(sessionBytes);
            header.setSessionId(new String(sessionBytes));
            message.setHeader(header);
            message.setContent(byteBuf.toString());
            list.add(message);
        }
    }
}
