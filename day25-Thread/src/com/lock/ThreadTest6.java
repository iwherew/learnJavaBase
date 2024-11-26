package com.lock;

import java.util.concurrent.locks.ReentrantLock;

/*
    ReentrantLock 互斥锁
    lock() 上锁
    unlock() 解锁
 */
public class ThreadTest6 {
    public static void main(String[] args) {
        TicketTask6 task = new TicketTask6();

        Thread t1 = new Thread(task,"窗口1");
        Thread t2 = new Thread(task,"窗口2");
        Thread t3 = new Thread(task,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class TicketTask6 implements Runnable{
    private int tickets = 2000;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true){
            try {
                lock.lock();
                if(tickets <= 0){
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "卖出了第" + tickets + "号票");
                tickets--;
            } finally {
                lock.unlock();
            }
        }
    }
}
