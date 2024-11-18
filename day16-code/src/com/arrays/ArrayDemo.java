package com.arrays;

import java.util.Arrays;

/*
Arrays类常用方法:
    public static String toString(类型[] a):将数组元素拼接为带有格式的字符串
    public static boolean equals(类型[] a，类型[] b):比较两个数组内容是否相同
    public static int binarySearch(int[] a,int key): 査找元素在数组中的索引(二分査找法:保证数组的元素是排好序的)
    public static void sort(类型[] a):对数组进行默认升序排序
 */

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33};
        int[] arr2 = {11, 22, 33};

        System.out.println(Arrays.toString(arr1)); // [11, 22, 33]
        System.out.println(Arrays.equals(arr1, arr2)); // true
        System.out.println(Arrays.binarySearch(arr1, 22)); // 1 【保证数组的元素是排好序的】
        System.out.println(Arrays.binarySearch(arr1, 66)); // -4 负数表示不存在


        int[] arr3 = {11, 33, 44, 22};
        Arrays.sort(arr3); // 默认升序，改变原数组
        System.out.println(Arrays.toString(arr3)); // [11, 22, 33, 44]
    }
}
