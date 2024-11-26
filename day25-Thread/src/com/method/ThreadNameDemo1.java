package com.method;
/*
    线程设置名字和获取名字
    Thread类的方法:
        public String getName():获取线程名字
        public void setName():设置线程名字
        public static Thread currentThread():获取当前线程的对象

 */
public class ThreadNameDemo1 {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread("B线程");
        MyThread myThread3 = new MyThread();

        myThread1.setName("A线程");

        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(super.getName()+"线程任务执行了："+i);
        }
    }

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }
}
