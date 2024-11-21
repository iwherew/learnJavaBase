package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        c.add("a");
        c.add("b");
        c.add("c");

        // 迭代器遍历
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }

        System.out.println("------------------------");

        // 增强for循环（编译为迭代器实现）
        for (String str : c) {
            System.out.println(str);
        }

        System.out.println("------------------------");

        // forEach
        c.forEach(s -> System.out.println(s));
    }
}
