package com.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
    Properties 和 IO 有关的方法
        void load(InputStream inStream) 从输入字节流读取属性列表(键和元素对)
        void load(Reader reader) 从输入字符流读取属性列表(键和元素对)
        void store(OutputStream out, string comments) 将集合的键值对写出到文件(字节流) comments:备注
        void store(Writer writer, String comments) 将集合的键值对写出到文件(字符流)
 */
public class PropertiesDemo2 {
    public static void main(String[] args) throws Exception {
//        store();
        load();
    }

    private static void load() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("day23-code/src/com/properties/config.properties");
        prop.load(fis);
        fis.close();
        System.out.println(prop);
    }

    private static void store() throws IOException {
        Properties prop = new Properties();

        prop.setProperty("username","admin");
        prop.setProperty("password","1234");

        FileOutputStream fos = new FileOutputStream("day23-code/src/com/properties/config.properties");

        prop.store(fos,null);

        fos.close();
    }
}
