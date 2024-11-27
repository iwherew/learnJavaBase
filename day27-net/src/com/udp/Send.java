package com.udp;

import java.net.*;

/*
    public DatagramSocket(int port)
    public DatagramPacket(byte buf[], int length, InetAddress address, int port)
 */

public class Send {
    public static void main(String[] args) throws Exception {
        // 1. 创建DatagramSocket对象，没有指定端口号就随机绑定端口
        DatagramSocket socket = new DatagramSocket(8888);
        // 2. 创建DatagramPacket对象
        String msg = "hello world";
        byte[] bytes = msg.getBytes();
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length,
                InetAddress.getByName("127.0.0.1"),9999);
        // 3.发送数据
        socket.send(packet);
        // 4.释放资源
        socket.close();
    }
}
