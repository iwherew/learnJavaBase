package com.method;
/*
    线程优先级的方法: 1（最低） - 10（最高） 默认：5
        public setPriority(int newPriority):设置线程优先级
        public final int getPriority():获取线程优先级

 */
public class ThreadMethodDemo2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 200; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }, "线程A");
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 200; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }, "线程B");

        t1.setPriority(1);
        t2.setPriority(10);

        System.out.println("t1优先级: " + t1.getPriority());
        System.out.println("t2优先级: " + t2.getPriority());

        t1.start();
        t2.start();
    }
}
