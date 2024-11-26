package com.lock;
/*
    同步代码块：
        synchronized(锁对象){
            多条语句操作共享数据的代码
        }
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        TicketTask2 t1 = new TicketTask2();
        TicketTask2 t2 = new TicketTask2();
        TicketTask2 t3 = new TicketTask2();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class TicketTask2 extends Thread{
    private static int tickets = 2000;
    private static Object lock = new Object();

    @Override
    public void run() {
        while(true){
            synchronized (lock) {
                if(tickets <= 0){
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "卖出了第" + tickets + "号票");
                tickets--;
            }
        }
    }
}
