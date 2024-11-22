package com.stream;

import java.io.*;

/*
    字节缓冲流在源代码中内置了字节数组，可以提高读写效率
        字节缓冲输入流:public BufferedInputStream(InputStream in)
        宇节缓冲输出流:public BufferedOutputStream(OutputStream out)

    单个字符拷贝：装满buf里的8192字节会自动放入文件，close方法把剩下的数据都放入文件
 */
public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 1.创建字节缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day23-code/src/com/stream/a/copy/source/A.txt"));
        // 1.创建字节缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day23-code/src/com/stream/a/copy/target/B.txt"));

        // 3.读写操作

        // 单个字节拷贝
//        int i;
//        while((i = bis.read()) != -1){
//            bos.write(i);
//        }

        // 数组拷贝（效率最高）内存里数组批量搬运in到out
        int len;
        byte[] bytes = new byte[8192];
        while((len = bis.read(bytes)) != -1){
            bos.write(bytes, 0, len);
        }


        // 4.关闭流
        bis.close();
        bos.close();
    }
}
