package com.method;
/*
    public final void setDaemon(boolean on):设置为守护线程
 */
public class ThreadMethodDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }, "线程A");

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 200; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }, "线程B");

        t2.setDaemon(true);

        t1.start();
        t2.start();

    }
}
