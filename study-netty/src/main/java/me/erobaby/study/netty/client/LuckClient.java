package me.erobaby.study.netty.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import me.erobaby.study.netty.pojo.LuckMessage;
import me.erobaby.study.netty.pojo.LuckHeader;

import java.util.UUID;

/**
 * Created by erobaby on 2017/1/23.
 */
public class LuckClient {
    public static void main(String[] args) throws InterruptedException {
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(group)
                    .channel(NioSocketChannel.class)
                    .handler(new LuckClientInitializer());

            // Start the connection attempt.
            Channel ch = b.connect("127.0.0.1", 8888).sync().channel();

            int version = 1;
            String sessionId = UUID.randomUUID().toString();
            String content = "I'm the luck protocol!";

            LuckHeader header = new LuckHeader();
            header.setVersion(version);
            header.setContentLength(content.length());
            header.setSessionId(sessionId);
            LuckMessage message = new LuckMessage();

            message.setHeader(header);
            message.setContent(content);
            ch.writeAndFlush(message);
            ch.close();
        } finally {
            group.shutdownGracefully();
        }
    }
}