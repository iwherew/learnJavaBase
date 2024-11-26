package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/*
    开启线程的第三种方式:实现Callable接口(带有返回值)
        1.编写一个类实现Callable接口
        2.重写call方法
        3.将线程任务代码写在call方法中
 */
public class ThreadDemo4 {
    public static void main(String[] args) throws Exception {
        // 创建线程任务资源对象
        MyCallable mc = new MyCallable();
        // 创建线程任务对象，封装线程资源
        FutureTask<Integer> task = new FutureTask<>(mc);
        FutureTask<Integer> task2 = new FutureTask<>(mc);
        // 创建线程对象，传入线程任务
        Thread thread = new Thread(task);
        Thread thread2 = new Thread(task2);
        // 使用线程对象调用start开启线程
        thread.start();
        thread2.start();

        Integer result = task.get();
        Integer result2 = task2.get();

        System.out.println("result: "+ result);
        System.out.println("result2: "+ result2);
    }
}

class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            System.out.println("线程执行了：" + i);
        }
        return sum;
    }
}