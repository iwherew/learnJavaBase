package com.correspondence;
/*
    两条线程通信

    wait() 等待
    notify() 随机唤醒一个等待的线程
    notifyAll() 唤醒所有等待的线程

    问题:sleep方法和wait方法的区别?
        回答:
        sleep方法是线程休眠，时间到了自动醒来，sleep方法在休眠的时候，不会释放锁
        wait方法是线程等待，需要由其它线程进行notify唤醒，wait方法在等待期间，会释放锁。
 */
public class CorrespondenceDemo1 {
    public static void main(String[] args) {
        Printer1 p = new Printer1();

        new Thread(()->{
            while(true){
                synchronized (Printer1.class) {
                    try {
                        p.print1();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();

        new Thread(()->{
            while(true){
                synchronized (Printer1.class) {
                    try {
                        p.print2();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();

    }
}

class Printer1 {
    int flag = 1;

    public void print1() throws InterruptedException {
        while(flag != 1){
            // 线程1等待
            Printer1.class.wait();
        }
        System.out.print("h");
        System.out.print("e");
        System.out.print("l");
        System.out.print("l");
        System.out.print("o");
        System.out.println();

        flag = 2;
        // 唤醒线程2
        Printer1.class.notifyAll();
    }
    public void print2() throws InterruptedException {
        while(flag != 2){
            // 线程2等待
            Printer1.class.wait();
        }

        System.out.print("w");
        System.out.print("o");
        System.out.print("r");
        System.out.print("l");
        System.out.print("d");
        System.out.println();

        flag = 1;
        // 唤醒线程1
        Printer1.class.notifyAll();
    }


}
