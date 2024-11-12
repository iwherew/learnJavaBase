package com.stringBuilder;

/*
    StringBuilder:
        1.一个可变的字符串
        2.StringBuilder是字符串缓冲区，将其理解是容器，这个容器可以存储任意数据类型，但是只要进入到这个容器，全部变成字符串。
        3.自动扩容
    构造方法：
        public StringBuilder():创建一个空白的字符串缓冲区(容器)，其初始容量为16个字符
        public StringBuilder(String str): 创建一个字符串緩冲区(容器)，容器在创建好之后，就会带有参数的内容
 */

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        s1.append(100);
        s1.append(4.5);
        s1.append('A');
        s1.append("test");
        System.out.println(s1);
    }
}
