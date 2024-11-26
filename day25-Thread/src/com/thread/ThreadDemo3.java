package com.thread;
/*
    开启线程的第二种方式:实现Runnable接口（无返回值）
        1.编写一个类实现Runnable接口
        2.重写run方法
        3.将线程任务代码写在run方法中
        4.创建线程任务资源
        5.创建线程对象，将资源传入
        6.使用线程对象调用start方法，开启线程
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        t1.start();
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("线程任务执行了：" + i);
        }
    }
}
