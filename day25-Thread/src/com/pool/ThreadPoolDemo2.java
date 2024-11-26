package com.pool;

import java.util.concurrent.*;

/*
    自定义线程池:

    public ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory, RejectedExecutionHandler handler)
    corePoolSize: 核心线程数（正式工）
    maximumPoolSize: 最大线程数（正式工 + 临时工）
    keepAliveTime: 空闲时间
    unit: 空闲时间的单位
    workQueue: 任务队列（指定排队数量）【有界队列 ArrayBlockingQueue<>(num) / 无界队列:LinkedBlockingQueue<>()】 无界队列最大长度 Integer.MAX_VALUE
    threadFactory: 线程对象任务工厂
    handler: 拒绝策略【AbortPolicy: 拒绝最新提交的任务并提交异常】

 */
public class ThreadPoolDemo2 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                2,
                5,
                60,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        for (int i = 0; i < 16; i++) {
            try {
                pool.submit(()->{
                    System.out.println(Thread.currentThread().getName() + "提交了任务");
                });
            } catch (RejectedExecutionException e) {
                // 可以在这里打印异常到日志文件
                System.out.println("打印日志文件");
                throw new RejectedExecutionException(e);
            }
        }
    }
}
