package com.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        // 1.创建ServerSocket对象，指定端口
        ServerSocket server = new ServerSocket(8899);
        System.out.println("服务端开启，等待客户连接...");
        // 2.响应客户端发送的请求，会阻塞
        Socket socket = server.accept();
        // 3.获取传输数据的流对象
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        // 4.传输数据
        byte[] buf = new byte[1024];
        int len = is.read(buf);
        String msg = new String(buf, 0, len);
        String ip = socket.getInetAddress().getHostAddress();
        System.out.println("读取到"+ip+"发送的消息："+msg);

        os.write("世界".getBytes());

        // 5. 关流释放资源
        socket.close();
        server.close();
    }
}
