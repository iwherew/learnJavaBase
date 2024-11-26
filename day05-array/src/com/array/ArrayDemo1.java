package com.array;

/*
    定义格式：
        1、数据类型[] 数组名
        2、数据类型 数组名[]

        注意 :这种定义格式，定义出来的，只是数组类型的变量而己，内存中还没有创建出数组容器.

    数据静态初始化格式：
        1、完整格式：
            数据类型[] 数组名 = new 数据类型[]{元素1, 元素2, 元素3};
        2、简化格式：
            数据类型[] 数组名 = {元素1, 元素2, 元素3};

    打印数组名：
        [I@4eec7777
        @：分割符
        [:当前空间，是数组类型的
        I:当前数组类型，是int类型
        4eec7777 :数组的十六进制内存地址
 */

public class ArrayDemo1 {
    public static void main(String[] args) {
        arrayTest2();
    }

    public static void arrayTest1(){
        int[] arr1;

        int arr2[];

//        System.out.println(arr1);
//        System.out.println(arr2);
    }

    public static void arrayTest2(){
        int[] arr1 = new int[]{1,2,3};
        double[] arr2 = {1.1, 2.2, 3.3};

        System.out.println(arr1); // [I@4eec7777
    }
}
