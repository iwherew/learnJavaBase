package com.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节流写出数据
        构造方法:
            1.public FileOutputStream(String name): 输出流关联文件，文件路径以字符串形式给出
            2.public FileOutputStream(File file):输出流关联文件，文件路径以File对象形式给出
            3.public FileOutputStream(String name, boolean append) 第二个参数append表示是否是追加写入模式，true表示在原有的基础上添加，false清空文件再写入
            4.public FileOutputStream(File file, boolean append) 第二个参数append表示是否是追加写入模式

        成员方法：
         public void write(int i) : 写入一个字节
         public void write(byte[] bytes) : 写入一个字节数组【字符串使用getBytes转为byte数组】
         public void write(byte b[], int off, int len) ： 写入字节数组的一部分，off 数组的起始索引，len 写的长度个数

        细节:
            输出流关联文件，文件如果不存在：会自动创建出来
            如果文件存在:会清空现有的内容，然后再进行写入操作

        流对象使用完毕后需要关闭

        jdk7后：
        把fos放到try()里，close会自动调用
        因为实现了AutoCloseable接口的close方法

        try(需要调用close方法的对象){
            逻辑代码...
        }catch(异常类名 对象名){
            异常的处理方式
        ｝

 */
public class FileOutputStreamDemo1 {
    public static void main(String[] args) {
        try( FileOutputStream fos = new FileOutputStream("day23-code/src/com/stream/a/A.txt");){
            fos.write(97);
            fos.write(98);
            fos.write(99);
            fos.write(new byte[]{100, 101, 102});
            fos.write("hello".getBytes());
            fos.write("0123456789".getBytes(), 2, 3);
//            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
