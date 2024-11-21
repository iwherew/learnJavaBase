package com.file;

import java.io.File;

/*
    File类的遍历方法
        public File[] listFiles() 获取当前目录下所有的 “一级文件对象" 返回 File 数组

    当调用者File表示的路径不存在时，返回null
    当调用者File表示的路径是文件时，返回null
    当调用者File表示的路径是一个空文件夹时，返回一个长度为0的数组
    当调用者File表示的路径是需要权限才能访问的文件夹时，返回null
 */
public class FileMethodDemo5 {
    public static void main(String[] args) {
        File f = new File("day22-code/src/com/file/aaa");

        File[] files = f.listFiles();
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }
}
