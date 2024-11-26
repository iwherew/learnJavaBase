package com.thread;
/*
    Java程序默认是多线程的，程序启动后默认会存在两条线程
        1.主线程
        2.垃圾回收线程
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
//        for (int i = 0; i < 1000000; i++) {
//            new Demo();
//        }

        // 开启的线程和主线程交替执行，要是顺序互换，则先执行完主线程再执行自定义线程
        MyThread myThread = new MyThread();
        myThread.start();
        for (int i = 0; i < 2000; i++) {
            System.out.println("主线程被执行了");
        }
    }
}

class Demo{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("垃圾被清理了");
        super.finalize();
    }
}