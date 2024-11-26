package com.array2;

public class Array2 {
    public static void main(String[] args) {
        // 静态初始化
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr[0][1]);
        for(int[] arr1 : arr){
            for(int j : arr1){
                System.out.println(j);
            }
        }

        // 动态初始化
        int[][] arr2 = new int[3][3];
    }
}
