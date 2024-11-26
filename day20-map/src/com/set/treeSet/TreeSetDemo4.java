package com.set.treeSet;

import java.util.Comparator;
import java.util.TreeSet;
/*
    可以自定义排序逻辑覆盖原有排序逻辑
 */
public class TreeSetDemo4 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        ts.add("a");
        ts.add("bbb");
        ts.add("cc");

        System.out.println(ts);
    }
}
