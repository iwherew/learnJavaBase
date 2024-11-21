package com.generics;

import java.util.ArrayList;
import java.util.Iterator;
/*
    泛型介绍 : JDK5引入的，可以在编译阶段约束操作的数据类型，并进行检查
        注意 :泛型默认的类型是Object
        泛型的好处:
        1.统一数据类型
        2.将运行期的错误提升到了编译期
 */
public class GenericsDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
