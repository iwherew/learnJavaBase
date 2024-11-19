package com.collectioin.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
    List集合的遍历方式:
        1.迭代器遍历
        2.增强for循环
        3.foreach方法
        4.普通for循环
        5.ListIterator(List集合特有的迭代器)

    并发修改异常 :ConcurrentModificationException
    场景:使用[迭代器]遍历集合的过程中，调用了[集合对象]的添加，删除方法，就会出现此异常

    解决方案:迭代器的遍历过程中，不允许使用集合对象的添加或删除，那就使用迭代器，自己的添加或删除方法
    list.remove -> iterator.remove()
    list.add -> iterator.add() 【需要使用ListIterator】
 */

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---------");

        ListIterator<String> iterator = list.listIterator();
        // 正向遍历
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("---------");

        // 逆向遍历，不能直接用
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
