package com.set.treeSet;

import com.set.treeSet.domain.Student;

import java.util.TreeSet;

/*
    需要添加 compareTo 方法
 */

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();

        ts.add(new Student("wang", 25));
        ts.add(new Student("amadeus", 18));
        ts.add(new Student("iwhere", 60));

        System.out.println(ts);
    }
}
