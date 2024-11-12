package com.stringBuilder;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        s1.append("abc");
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);
        String s2 = s1.toString(); // 将缓冲区的内容，以String字符串类型返回
        System.out.println(s2);
    }
}
