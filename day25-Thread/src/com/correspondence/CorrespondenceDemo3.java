package com.correspondence;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/*
    使用 ReentrantLock 可以唤醒指定的线程

 */

public class CorrespondenceDemo3 {
    public static void main(String[] args) {
        Printer3 p = new Printer3();

        new Thread(()->{
            while(true){
                try {
                    p.print1();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        new Thread(()->{
            while(true){
                try {
                    p.print2();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        new Thread(()->{
            while(true){
                try {
                    p.print3();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

    }
}

class Printer3 {
    ReentrantLock lock = new ReentrantLock();

    Condition c1 = lock.newCondition();
    Condition c2 = lock.newCondition();
    Condition c3 = lock.newCondition();

    int flag = 1;

    public void print1() throws InterruptedException {
        lock.lock();

        if(flag != 1){
            c1.await();
        }

        System.out.print("h");
        System.out.print("e");
        System.out.print("l");
        System.out.print("l");
        System.out.print("o");
        System.out.println();

        flag = 2;
        c2.signal();

        lock.unlock();
    }

    public void print2() throws InterruptedException {
        lock.lock();

        if(flag != 2){
            c2.await();
        }

        System.out.print("w");
        System.out.print("o");
        System.out.print("r");
        System.out.print("l");
        System.out.print("d");
        System.out.print("!");
        System.out.println();

        flag = 3;
        c3.signal();

        lock.unlock();
    }

    public void print3() throws InterruptedException {
        lock.lock();

        if(flag != 3){
            c3.await();
        }

        System.out.print("t");
        System.out.print("e");
        System.out.print("s");
        System.out.print("t");
        System.out.println();

        flag = 1;
        c1.signal();

        lock.unlock();
    }


}
