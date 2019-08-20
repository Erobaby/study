package me.erobaby.study.netty.bio;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class BioClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress("127.0.0.1", 8888));
        OutputStream os = socket.getOutputStream();
        String data = "hwllo world";
        os.write(data.getBytes());
        os.flush();
    }
}
