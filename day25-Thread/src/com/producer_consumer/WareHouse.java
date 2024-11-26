package com.producer_consumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/*
    生产者消费者模式
 */
public class WareHouse {
    public static boolean mark = false;
    public static ReentrantLock lock = new ReentrantLock();
    public static Condition producer = lock.newCondition();
    public static Condition consumer = lock.newCondition();
}
