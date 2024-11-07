package com.control;

/*
    continue:不结束所有循环，只结束本轮循环
 */

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if(i == 2){
                continue;
            }
            System.out.println(i);
        }
    }
}
