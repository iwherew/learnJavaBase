package com.printStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
    PrintStream的基本使用
        1，创建对象关联文件
            public PrintStream(OutputStream os) 追加写入在 FileOutputStream 第二个参数
            public PrintStream(File f)
            public PrintStream(File f, String csn)  第二个参数字符编码(gbk等)
            public PrintStream(String filepath)
            public PrintStream(String filepath, String csn) 第二个参数字符编码(gbk等)
        2.写出方法
            write():写出一个字节，不建议使用，无法原样写入，
            print():原样写入数据，无换行
            println(): 原样写入数据，带有换行
 */
public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
//        PrintStream ps = new PrintStream("day23-code/src/com/printStream/A.txt");
        PrintStream ps = new PrintStream(new FileOutputStream("day23-code/src/com/printStream/A.txt", true)); // 追加写入
        ps.print(11);
        ps.print(22);
        ps.print(33);
        ps.println(44);
        ps.println(55);
        ps.println(66);
        ps.println("你好");
        ps.close();
    }
}
