package com.character;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
    FileReader:用于读取纯文本文件，解决中文乱码问题
        构造方法:
            1.public FileReader(String fileName) 字符输入流关联文件，路径以字符串形式给出
            2.public FileReader(File file) 字符输入流关联文件，路径以File对象形式给出
        成员方法:
            public int read():读取单个字符
            public int read(char[] chars):读取一个字符数组，返回读取到的有效字符个数
 */
public class FileReaderDemo1 {
    public static void main(String[] args) throws IOException {
//        readByOne();

        FileReader fr = new FileReader("day23-code/src/com/character/copy/A.txt");

        char[] chars = new char[1024];
        int len;
        while ((len = fr.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }
    }

    private static void readByOne() throws IOException {
        FileReader fr = new FileReader("day23-code/src/com/character/copy/A.txt");

        int i;
        while((i = fr.read()) != -1){
            System.out.print((char)i);
        }
        fr.close();
    }
}
