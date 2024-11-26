package com.lock;
/*
    同步方法:在方法的返回值类型前面加入 synchronized 关键字
    public synchronized void method(){}

    同步方法的锁对象:
        1.非静态的方法: this
        2.静态的方法: 类的字节码对象
 */
public class ThreadTest4 {
    public static void main(String[] args) {
        TicketTask4 task = new TicketTask4();

        Thread t1 = new Thread(task,"窗口1");
        Thread t2 = new Thread(task,"窗口2");
        Thread t3 = new Thread(task,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class TicketTask4 implements Runnable{
    private int tickets = 2000;

    @Override
    public void run() {
        while(true){
            if (method()) break;
        }
    }

    private synchronized boolean method() {
        if(tickets <= 0){
            return true;
        }
        System.out.println(Thread.currentThread().getName() + "卖出了第" + tickets + "号票");
        tickets--;
        return false;
    }
}

