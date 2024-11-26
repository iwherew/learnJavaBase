package com.set.hashSet;

import java.util.LinkedHashSet;
/*
    LinkedHashSet特点:去重，并保证存取顺序
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("b");
        lhs.add("a");
        lhs.add("c");
        lhs.add("b");

        System.out.println(lhs);
    }
}
