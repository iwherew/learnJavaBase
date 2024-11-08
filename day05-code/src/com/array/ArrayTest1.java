package com.array;

public class ArrayTest1 {
    public static void main(String[] args) {
        printArray();
    }

    public static void printArray() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
