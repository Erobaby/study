package me.erobaby.study.netty.server;

/**
 * Created by erobaby on 2017/1/23.
 */
public class Main {
    public static void main(String[] args) {
//        MyServer discardServer = new MyServer(8881, new DiscardServerHandler());
//        MyServer echoServer = new MyServer(8882, new EchoServerHandler());
//        MyServer timeServer = new MyServer(8883, new TimeServerHandler());
        LuckServer luckServer = new LuckServer(8883);
        try {
//            discardServer.run();
//            echoServer.run();
//            timeServer.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
