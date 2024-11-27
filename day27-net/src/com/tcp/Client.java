package com.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        // 1.创建Socket对象，指定ip和端口
        Socket socket = new Socket("127.0.0.1",8899);
        // 2.获取传输数据的流对象
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        // 3.传输数据
        os.write("你好".getBytes());
        // 4.接收数据
        byte[] buf = new byte[1024];
        int len = is.read(buf);
        String msg = new String(buf, 0, len);
        String ip = socket.getInetAddress().getHostAddress();
        System.out.println("读取到"+ip+"发送的消息："+msg);

        // 5.释放资源
        socket.close();
    }
}
