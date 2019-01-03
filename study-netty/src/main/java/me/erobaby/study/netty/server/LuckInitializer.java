package me.erobaby.study.netty.server;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;

/**
 * Created by erobaby on 2017/1/23.
 */
public class LuckInitializer extends ChannelInitializer<SocketChannel> {


    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline pipeline = socketChannel.pipeline();
        // 添加编码器
        pipeline.addLast(new LuckEncoder());
        // 添加解码器
        pipeline.addLast(new LuckDecoder());

        // 添加逻辑控制层
        pipeline.addLast(new LuckHandler());
    }
}
