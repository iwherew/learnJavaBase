package com.tools;

/*
    工具类的方法用static修饰，在外面直接调用类使用
    私有该类的构造方法
    目的:为了不让其他类，再创建对象I
 */

public class ArrayTools {
    private ArrayTools(){}

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int item : arr) {
            if(item > max){
                max = item;
            }
        }
        return max;
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for (int item : arr) {
            if(item < min){
                min = item;
            }
        }
        return min;
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
