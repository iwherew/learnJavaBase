package com.collection.list;

import java.util.ArrayList;
import java.util.List;

/*
    List接口的特点:存取有序，有索引，可以存储重复的
    和索引有关的API :
        public void add(int index，E element):在指定的索引位置，添加元索
        public E remove(int index):根据索引删除集合中的元素
        public E set(int index，E element):根据索引修改集合中的元素
        public E get(int index):返回指定索引处的元素
 */
public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list); // [a, b, c]

        list.add(1,"d");
        System.out.println(list); // [a, d, b, c]

        list.remove(2);
        System.out.println(list); // [a, d, c]

        list.set(0,"f");
        System.out.println(list); // [f, d, c]

        System.out.println(list.get(1)); // d
//        System.out.println(list[1]);  // 错误写法

        List<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(22);
        list2.add(33);
//        list2.remove(22); // Index 22 out of bounds for length 3
        list2.remove(Integer.valueOf(22)); // 删除元素为整数时，需要手动装箱
        System.out.println(list2); // [11, 33]
    }
}
