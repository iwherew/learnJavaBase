package com.character;

import java.io.FileWriter;
import java.io.IOException;

/*
    FileWriter字符输出流写出数据:

    构造方法:
        FileWriter(String fileName):字符输出流关联文件，路径以字符串形式给出
        FileWriter(String fileName, boolean append):参数2:追加写入的开关
        FileWriter(File file):字符输出流关联文件，路径以File对象形式给出
        FileWriter(File file, boolean append):参数2:追加写入的开关

    成员方法:
        public void write(int c) 写出单个字符
        public void write(char[] chars) 写出一个字符数组
        public write(char[] chars, int off, int len) 写出字符数组的一部分
        public void write(String str) 写出字符串
        public void write(String str, int off, int len) 写出字符串的一部分

    注意事项:字符输出流写出数据，需要调用flush或close方法，数据才会写出
        flush():刷出数据，刷出后可以继续写出
        close():关闭流释放资源，顺便刷出数据，关闭后不可以继续写出
 */
public class FileWriterDemo1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day23-code/src/com/character/copy/B.txt");

        char[] chars = {'a','b','c'};

        fw.write('a');
        fw.write(chars);
        fw.write(chars,0,2);
        fw.write("你好你好");
        fw.write("哈哈哈哈哈",0,2);

        fw.close();
    }
}
