package com.stream;

import java.io.FileInputStream;
import java.util.Arrays;

/*
    字节流读取数据:读到文件末尾返回 -1
        public int read():读取单个字节

        public int read(byte[] bytes): 读取一个字节数组
            将读取到的字节，存入数组容器，返回读取到的有效字节个数

        将字节数组转换为字符串
        public String (byte[]bytes, int offset, int length)
                         字节数组       起始索引    转换的个数
 */
public class FileInputStreamDemo1 {
    public static void main(String[] args) {
//        readByOne();

        try(FileInputStream fis = new FileInputStream("day23-code/src/com/stream/a/A.txt");){
            byte[] bytes = new byte[3];

            int len;
            while((len = fis.read(bytes)) != -1){
                String str = new String(bytes,0,len);
                System.out.println(str);
            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }

    private static void readByOne() {
        // 单个读取
        try(FileInputStream fis = new FileInputStream("day23-code/src/com/stream/a/A.txt");){
            int i;
            while((i = fis.read()) != -1){
                System.out.println(i);
                System.out.println((char)i);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
