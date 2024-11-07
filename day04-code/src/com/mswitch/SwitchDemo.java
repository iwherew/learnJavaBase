package com.mswitch;

public class SwitchDemo {
    public static void main(String[] args) {
        int num = 2;
        switch (num) {
            case 1:
                System.out.println("1");
            // 不写break会继续执行2
                break;
            case 2:
                System.out.println("2");
                break;
            // 所有都失败的情况执行
            default:
                System.out.println("3");
                break;
        }
    }
}
