package com.thread;
/*
    开启线程第一种方式:继承Thread类
        1.编写一个类继承Thread
        2.重写run方法
        3.将线程任务代码写在run方法中
        4.创建线程对象
        5.调用start方法开启线程(调用run方法没有开启新线程)

    细节:调用start方法开启线程，会自动的调用run方法执行
    注意:只有调用了start方法，才是开启了新的线程
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        MyThread thread2 = new MyThread();

        thread.start();
        thread2.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("线程任务执行了："+i);
        }
    }
}