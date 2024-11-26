package com.transform;

import java.io.*;

/*
    转换流的作用:
        1.按照指定的字符编码读写操作
        2.可以将字节流转换为字符流进行操作

    转换流按照指定的字符编码读写
        构造方法:
        InputStreamReader(InputStream in,String CharsetName)
        OutputStreamWriter(OutputStream in,String CharsetName)
 */
public class ChangeStreamDemo {
    public static void main(String[] args) throws IOException {
        read();
//        write();
    }

    private static void write() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day23-code/src/com/transform/A.txt", true),"gbk");
        osw.write("测试");
        osw.close();
    }

    private static void read() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day23-code/src/com/transform/A.txt"), "gbk");

        int i;
        while ((i = isr.read()) != -1) {
            System.out.print((char) i);
        }
        isr.close();
    }
}
