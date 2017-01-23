package me.erobaby.client;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import me.erobaby.pojo.LuckMessage;

/**
 * Created by erobaby on 2017/1/23.
 */
public class LuckClientHandler extends SimpleChannelInboundHandler<LuckMessage> {
    @Override
    protected void messageReceived(ChannelHandlerContext channelHandlerContext, LuckMessage message) throws Exception {
        System.out.println(message);
    }
}
