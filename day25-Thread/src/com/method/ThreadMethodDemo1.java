package com.method;
/*
休眠线程的方法
    public static void sleep(long time):让线程休眠指定的时间，单位为亳秒
 */
public class ThreadMethodDemo1 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 5; i >= 1; i--) {
            System.out.println("倒计时："+i+"秒");
            Thread.sleep(1000);
        }
    }
}
