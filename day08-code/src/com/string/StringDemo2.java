package com.string;

/*
    String类常见构造方法
        public String(): 创建一个空白字符串，里面不含任何内容
        public String(char[]chs):根据传入的字符数组，创建字符串对象
        public String(string original):根据传入的字符串，来创建字符串对象
    字符串对象，两种创建方式的区别
        1.双引号直接创建（字符串常量池）
        2.通过构造方法创建（创建对象空间）
 */

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1);

        char[] chs = {'a','b','c'};
        String s2 = new String(chs);
        System.out.println(s2);

        String s3 = new String("abc");
        System.out.println(s3);

        String s4 = "abc";
        System.out.println(s4);

        String str1 = "ddd";
        String str2 = "ddd";
        String str3 = new String("ddd");
        String str4 = new String("ddd");
        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str3 == str4); // false

        String ss1 = "www";
        String ss2 = "w"+"w"+"w";
        System.out.println(ss1 == ss2); // true（常量优化机制）编译的之后拼成整体

    }
}
