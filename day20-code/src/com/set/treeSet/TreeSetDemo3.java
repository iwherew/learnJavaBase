package com.set.treeSet;

import com.set.treeSet.domain.Student;

import java.util.Comparator;
import java.util.TreeSet;
/*
    构造器方法定义比较器
    如果同时具备比较器和自然排序，会优先按照比较器的规则，进行排序操作
 */
public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                int ageDiff = o1.getAge() - o2.getAge();
                if (ageDiff == 0) {
                    int nameDiff = o1.getName().compareTo(o2.getName());
                    return nameDiff == 0 ? 1 : nameDiff;
                }else{
                    return ageDiff;
                }
            }
        });

        ts.add(new Student("wang", 25));
        ts.add(new Student("amadeus", 18));
        ts.add(new Student("iwhere", 60));

        System.out.println(ts);
    }
}
