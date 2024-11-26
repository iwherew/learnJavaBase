package com.generics;
/*
    泛型方法
        1.非静态的方法 :内部的泛型，会根据类的泛型去匹配
        2.静态的方法 :静态方法中如果加入了泛型，必须声明出自己独立的泛型
            -时机:在调用方法，传入实际参数的时候，确定到具体的类型【只能接引用数据类型，不能接基础数据类型，比如Int】
 */
public class GenericsDemo3 {
    public static void main(String[] args) {
        String[] arr1 = {"aa","bb","cc"};
        Integer[] arr2 = {1,2,3};
        Double[] arr3 = {1.1,2.2,3.3};

        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
    }

    public static <T> void printArray(T[] arr){
        for(T s : arr){
            System.out.println(s);
        }
    }
}
