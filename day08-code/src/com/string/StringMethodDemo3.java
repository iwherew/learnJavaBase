package com.string;

public class StringMethodDemo3 {
    public static void main(String[] args) {
        String s1 = "amadeus";
        String s2 = s1.substring(2,5);  // 剪切
        System.out.println(s2);
        String s3 = s1.replace("am","ww");  // 替换
        System.out.println(s3);
        String[] sArr = "192.168.1.1".split("\\."); // .是通配符，需要转义，切割
        for (int i = 0; i < sArr.length; i++) {
            System.out.println(sArr[i]);
        }
    }
}
