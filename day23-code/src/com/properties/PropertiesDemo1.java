package com.properties;

import java.util.Properties;

/*
    Properties作为集合的使用
        Object setProperty(string key, String value): 类似Map集合的put方法
        String getProperty(string key): 类似Map集合的get方法
        Set<String> stringPropertyNames(): 类似Map是集合的keySet方法

    Properties的键值对都是字符串
 */
public class PropertiesDemo1 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("username","admin");
        prop.setProperty("password","1234");

        System.out.println(prop);
        System.out.println(prop.getProperty("username"));

        for (String key : prop.stringPropertyNames()) {
            System.out.println(prop.getProperty(key));
        }
    }
}
