package me.erobaby.client;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import me.erobaby.server.LuckDecoder;
import me.erobaby.server.LuckEncoder;

/**
 * Created by erobaby on 2017/1/23.
 */
public class LuckClientInitializer extends ChannelInitializer<SocketChannel> {

    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline pipeline = socketChannel.pipeline();

        // 添加编解码器, 由于ByteToMessageDecoder的子类无法使用@Sharable注解,
        // 这里必须给每个Handler都添加一个独立的Decoder.
        pipeline.addLast(new LuckEncoder());
        pipeline.addLast(new LuckDecoder());

        // and then business logic.
        pipeline.addLast(new LuckClientHandler());
    }
}
