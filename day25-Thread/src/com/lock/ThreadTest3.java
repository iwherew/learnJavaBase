package com.lock;
/*
    锁对象为类的字节码文件 synchronized (TicketTask3.class)
 */
public class ThreadTest3 {
    public static void main(String[] args) {
        TicketTask3 t1 = new TicketTask3();
        TicketTask3 t2 = new TicketTask3();
        TicketTask3 t3 = new TicketTask3();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class TicketTask3 extends Thread{
    private static int tickets = 2000;

    @Override
    public void run() {
        while(true){
            synchronized (TicketTask3.class) {
                if(tickets <= 0){
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "卖出了第" + tickets + "号票");
                tickets--;
            }
        }
    }
}
