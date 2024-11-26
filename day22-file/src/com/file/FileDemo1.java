package com.file;

import java.io.File;
import java.io.IOException;

/*
    File:文件或文件夹对象
        构造方法:
        1.public File(String pathname): 根据传入的字符串路径封装File对象
        2.public File(String parent, String child): 根据传入的父级路径和子级路径来封装File对象
        3.public File(File parent, String child): 根据传入的父级路径(File类型)和子级路径来封装File对象

        File 对象可以定位文件和文件夹
        File 封装的对象仅仅是一个路径名，这个路径可以是存在的，也可以是不存在的

        可以是绝对路径，也可以是相对路径

        路径的写法
            1.绝对路径:从盘符根目录开始，一直到某个具体的文件或文件夹
            2.相对路径:相对于当前项目
 */
public class FileDemo1 {
    public static void main(String[] args) throws IOException {
//        File f1 = new File("E:\\learnJavaBase\\day22-code\\src\\com\\file\\A.txt");
        File f1 = new File("day22-code/src/com/file/A.txt");
        System.out.println(f1.exists());
        if(!f1.exists()){
            f1.createNewFile();
        }

        File f2 = new File("E:\\learnJavaBase\\day22-code\\src\\com\\file","A.txt");
        System.out.println(f2.exists());

        File f3 = new File(new File("E:\\learnJavaBase\\day22-code\\src\\com\\file"),"A.txt");
        System.out.println(f3.exists());

        File f0 = new File("");
        System.out.println(f0.getAbsoluteFile()); // E:\learnJavaBase
    }
}
