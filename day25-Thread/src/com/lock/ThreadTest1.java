package com.lock;
/*
    需求:某电影院共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        TicketTask task = new TicketTask();

        Thread t1 = new Thread(task,"窗口1");
        Thread t2 = new Thread(task,"窗口2");
        Thread t3 = new Thread(task,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class TicketTask implements Runnable{
    private int tickets = 2000;

    @Override
    public void run() {
        while(true){
            synchronized (this) {
                if(tickets <= 0){
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "卖出了第" + tickets + "号票");
                tickets--;
            }
        }
    }
}
