package com.character;

import java.io.*;

/*
    字符缓冲流的基本使用
        注意: 缓冲流本身不具备读写功能，只是对普通的流对象做包装
        构造方法:
            BufferedReader(Reader reader)
            BufferedWriter(Writer writer)
 */
public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
//        readByOne();

        BufferedReader br = new BufferedReader(new FileReader("day23-code/src/com/character/copy/A.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day23-code/src/com/character/copy/C.txt"));

        char[] chs = new char[8192];
        int len;
        while ((len = br.read(chs)) != -1) {
            bw.write(chs, 0, len);
        }

        br.close();
        bw.close();
    }

    private static void readByOne() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day23-code/src/com/character/copy/A.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day23-code/src/com/character/copy/C.txt"));

        int i;
        while ((i = br.read()) != -1) {
            bw.write(i);
        }

        br.close();
        bw.close();
    }
}
