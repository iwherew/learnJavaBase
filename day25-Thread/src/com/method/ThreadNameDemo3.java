package com.method;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadNameDemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建线程任务资源对象
        MyCallable mc = new MyCallable();
        // 创建线程任务对象，封装线程资源
        FutureTask<Integer> task = new FutureTask<>(mc);
        FutureTask<Integer> task2 = new FutureTask<>(mc);
        // 创建线程对象，传入线程任务
        Thread thread = new Thread(task, "线程A");
        Thread thread2 = new Thread(task2, "线程B");
        // 使用线程对象调用start开启线程
        thread.start();
        thread2.start();

        Integer result = task.get();
        Integer result2 = task2.get();

        System.out.println(thread.getName() + " result: "+ result);
        System.out.println(thread2.getName() + " result2: "+ result2);
    }
}

class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            System.out.println(Thread.currentThread().getName()+"线程执行了：" + i);
        }
        return sum;
    }
}