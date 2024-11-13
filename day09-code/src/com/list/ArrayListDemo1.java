package com.list;

import java.util.ArrayList;

/*
    ArrayList 长度可变，位置不够时扩容1.5倍
    <>: 泛型
        目前:使用泛型，可以对集合中存储的数据，进行类型限制
        细节:泛型中，不允许编写基本数据类型
        问题:那我要是想集合中，存储 整数，小数，字符...这些数据，怎么办呢?
        解决:使用基本数据类型，所对应的包装类
            byte    Byte
            short   Short
            int     Integer
            Long    Long
            float   Float
            double  Double
            boolean Boolean
            char    Character

 */

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        System.out.println(list);

    }
}
