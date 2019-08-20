package me.erobaby.study.netty.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class BioServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress(8888));
        while (true) {
            Socket socket = serverSocket.accept();
            InputStream is = socket.getInputStream();
            byte[] data = new byte[1024];
            is.read(data);
            is.close();
        }
    }

}
