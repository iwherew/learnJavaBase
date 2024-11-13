package com.list;

import java.util.ArrayList;

/*
    ArrayList 常用成员方法:
    1.增
        public boolean add(Ee):将指定的元素添加到此列表的尾部
        public void add(int index，E element):在指定索引位置，添加对应的元素(插队)
    2.删
        public E remove(int index):根据索引做删除，返回被删除掉的元素
        public boolean remove(Object o):根据元素做删除，返回是否删除成功的状态
    3.改
        public E set(int index，E element): 修改指定索引位置，为对应的元素，返回被覆盖掉的元素
    4.查
        public E get(int index) 根据索引，获取集合中的元素
        public int size() 返回集合中元素的个数

 */

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list =  new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        String result = list.get(1);
        System.out.println(result);
        System.out.println(list.size());
    }

    private static void updateMethod() {
        ArrayList<String> list =  new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        String result = list.set(1, "r"); // 返回被覆盖的元素
        System.out.println(list);
        System.out.println(result);
    }

    private static void removeMethod() {
        ArrayList<String> list =  new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        String result = list.remove(1); // 删除指定位置元素
        System.out.println(list);
        System.out.println(result); // 被删除的元素
        list.remove("c"); // 删除首次出现的元素，返回boolean，是否删除成功状态
        System.out.println(list);
    }

    private static void addMethod() {
        ArrayList<String> list =  new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add(1,"c");
        System.out.println(list);
    }
}
