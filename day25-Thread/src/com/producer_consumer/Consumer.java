package com.producer_consumer;

public class Consumer implements Runnable {

    @Override
    public void run() {
        while(true){
            WareHouse.lock.lock();
            if(WareHouse.mark){
                // true: 有产品，消费产品，改变mark状态，唤醒消费者线程
                System.out.println("消费者线程消费...");
                WareHouse.mark = false;
                WareHouse.producer.signal();
            }else{
                // false: 无产品，线程进入等待状态
                try {
                    WareHouse.consumer.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            WareHouse.lock.unlock();
        }
    }
}
