package com.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
    为了方便我们对IP地址的获取和操作，Java提供了一个类InetAddress 供我们使用
    InetAddress:此类表示Internet协议(IP)地址。

    static InetAddress getByName(String host) 确定主机名称的IP地址(主机名称可以是机器名称，也可以是IP地址)
    String getHostName() 获取此 IP 地址的主机名
    String getHostAddress() 返回文本显示中的 IP 地址字符串
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("wanglilong");
        System.out.println(address);

        String hostName = address.getHostName();
        System.out.println(hostName);

        String hostAddress = address.getHostAddress();
        System.out.println(hostAddress);
    }
}
