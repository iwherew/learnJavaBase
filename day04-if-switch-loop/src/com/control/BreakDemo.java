package com.control;

/*
    break：跳出循环/switch
    可以给循环标号（起名字），break跳出指定循环
 */

public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if(i == 3){
                break;
            }
            System.out.println(i);
        }

        myFor:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(j == 3){
                    break myFor;
                }
                System.out.println(i+" - " + j);
            }
        }
    }
}
