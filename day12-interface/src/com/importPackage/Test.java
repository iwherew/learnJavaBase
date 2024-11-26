package com.importPackage;

import com.importPackage.a.Student;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        // 类名重复：使用全类名创建对象:包名+类名
        com.importPackage.b.Student s2 = new com.importPackage.b.Student();
    }
}
