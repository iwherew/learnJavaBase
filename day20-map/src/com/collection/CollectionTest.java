package com.collection;
/*
Collection的常用方法:
    public boolean add(E e):把给定的对象添加到当前集合中
    public void clear():清空集合中所有的元素
    public boolean remove(E e):把给定的对象在当前集合中删除，删除对象时需要重写equals方法，或传入地址值
    public boolean contains(Object obj): 判断当前集合中是否包含给定的对象，查找对象时需要重写equals方法，或传入地址值
    public boolean isEmpty():判断当前集合是否为空
    public int size(): 返回集合中元素的个数(集合的长度)
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("a");
        c.add("b");
        c.add("c");

        System.out.println(c);

        c.remove("b");
        System.out.println(c);

        System.out.println(c.contains("a"));
        System.out.println(c.contains("f"));
        System.out.println(c.isEmpty());
        System.out.println(c.size());

        c.clear();
        System.out.println(c);
    }
}
