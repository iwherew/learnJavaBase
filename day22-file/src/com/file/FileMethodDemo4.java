package com.file;

import java.io.File;
import java.io.IOException;

/*
    File类的创建方法和删除方法: 返回值是否成功创建/删除
        public boolean createNewFile():创建文件
        public boolean mkdir():创建单级文件夹
        public boolean mkdirs() 创建多级文件夹
        public boolean delete() 删除文件或文件夹，只能删除空文件夹
 */
public class FileMethodDemo4 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("day22-code/src/com/file/A.txt");
        f1.createNewFile();

        File f2 = new File("day22-code/src/com/file/aaa/bbb");
        f2.mkdirs();

//        f2.delete();

    }
}
