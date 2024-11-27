package com.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
/*
    public DatagramPacket(byte buf[], int length)
 */
public class Receive {
    public static void main(String[] args) throws Exception  {
        // 1. 创建DatagramSocket对象，没有指定端口号就随机绑定端口
        DatagramSocket socket = new DatagramSocket(9999);
        // 2. 创建DatagramPacket对象
        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
        // 3. 接受数据，receive会阻塞
        socket.receive(packet);
        // 4.拆包裹
        byte[] data = packet.getData();
        String msg = new String(data, 0, packet.getLength());
        String ip = packet.getAddress().getHostName();
        System.out.println("接受到"+ip+"发送过来的消息为："+msg);
        // 5.释放资源
        socket.close();

    }
}
