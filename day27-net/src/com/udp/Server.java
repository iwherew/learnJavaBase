package com.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(3333);
        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
        System.out.println("聊天室开启...");
        while (true) {
            socket.receive(packet);
            byte[] data = packet.getData();
            String ip = packet.getAddress().getHostName();
            String msg = new String(data, 0, packet.getLength());
            System.out.println("接受到"+ip+"发送过来的消息为："+msg);
        }
    }
}
