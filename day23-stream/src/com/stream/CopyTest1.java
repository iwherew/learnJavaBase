package com.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest1 {
    /*
    将 a.png，拷贝到 别处
        1.创建输入流对象读取文件
        2.创建输出流对象关联数据目的
        3.读写操作
        4.关流释放资源
     */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day23-code/src/com/stream/a/copy/source/a.png");
        FileOutputStream fos = new FileOutputStream("day23-code/src/com/stream/a/copy/target/b.png");

        byte[] bytes = new byte[8192];
        int len;
        while( (len = fis.read(bytes)) != -1 ){
            fos.write(bytes, 0, len);
        }

        fis.close();
        fos.close();
    }
}
