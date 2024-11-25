package com.character;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
    字符缓冲流的特有方法:
        public string readLine() 读取一行字符串，读取到末尾返回 null
        public void newLine() 写出换行符(具有跨平台性)
 */
public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day23-code/src/com/character/copy/A.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
