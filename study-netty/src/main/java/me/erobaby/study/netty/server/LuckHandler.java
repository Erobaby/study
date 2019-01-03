package me.erobaby.study.netty.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import me.erobaby.study.netty.pojo.LuckMessage;

/**
 * Created by erobaby on 2017/1/23.
 */
public class LuckHandler extends SimpleChannelInboundHandler<LuckMessage> {
    protected void messageReceived(ChannelHandlerContext channelHandlerContext, LuckMessage luckMessage) throws Exception {
        System.out.println(luckMessage.toString());
    }
}
