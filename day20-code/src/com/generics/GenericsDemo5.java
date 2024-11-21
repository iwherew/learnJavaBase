package com.generics;

import java.util.ArrayList;
/*
    泛型通配符
        ? : 任意类型
        ? extends E : 可以传入的是E，或者是E的子类
        ? super E : 可以传入的是E，或者是E的父类
 */
public class GenericsDemo5 {
    public static void main(String[] args) {
        ArrayList<Coder> arr1 = new ArrayList<>();
        arr1.add(new Coder());

        ArrayList<Manager> arr2 = new ArrayList<>();
        arr2.add(new Manager());

        ArrayList<String> arr3 = new ArrayList<>();
        arr3.add("A");

        method(arr1);
        method(arr2);
//        method(arr3); // ClassCastException
    }

    public static void method(ArrayList<? extends Employee> list) {
        for (Object obj : list) {
            Employee employ = (Employee) obj;
            employ.work();
        }
    }
}

abstract class Employee {
    public abstract void work();
}

class Coder extends Employee {
    public void work() {
        System.out.println("Coder works");
    }
}

class Manager extends Employee {
    public void work() {
        System.out.println("Manager works");
    }
}
