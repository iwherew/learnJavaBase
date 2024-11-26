package com.collection.list;

import java.util.LinkedList;

/*
    LinkedList 特有方法:
        public void addFirst(E e):头部添加
        public void addLast(E e):尾部添加
        public E getFirst():获取第一个
        public E getLast():获取最后一个
        public E removeFirst():删除第一个
        public E removeLast():删除最后一个
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println(list);
    }
}
