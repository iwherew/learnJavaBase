package com.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    JDK自带线程池（不推荐使用，一般使用自定义线程池）
    Executors 中提供静态方法来创建线程池
        static ExecutorService newCachedThreadPool() 创建一个默认的线程池(Integer.MAX_VALUE大小) 太大了不推荐使用
        static newFixedThreadPool(int nThreads) 创建一个指定最多线程数量的线程池
 */
public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        // 1.获取线程池对象
        ExecutorService pool = Executors.newFixedThreadPool(10);

        // 2.提交线程任务
        for (int i = 0; i < 100; i++) {
            pool.submit(()->{
                System.out.println(Thread.currentThread().getName() + "提交了任务线程");
            });
        }

        pool.shutdown();
    }
}
