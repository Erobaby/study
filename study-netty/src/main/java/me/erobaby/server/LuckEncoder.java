package me.erobaby.server;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.MessageToByteEncoder;
import me.erobaby.pojo.LuckHeader;
import me.erobaby.pojo.LuckMessage;

import java.util.List;

/**
 * Created by erobaby on 2017/1/23.
 */
public class LuckEncoder extends MessageToByteEncoder<LuckMessage> {
    protected void encode(ChannelHandlerContext ctx, LuckMessage message, ByteBuf byteBuf) throws Exception {
        LuckHeader header = message.getHeader();
        String content = message.getContent();
        byteBuf.writeInt(header.getVersion());
        byteBuf.writeInt(header.getContentLength());
        byteBuf.writeBytes(header.getSessionId().getBytes());
        byteBuf.writeBytes(content.getBytes());
    }
}
