package com.producer_consumer;

public class Producer implements Runnable {

    @Override
    public void run() {
        while(true){
            WareHouse.lock.lock();
            if(WareHouse.mark){
                // true: 有产品，线程进入等待状态
                try {
                    WareHouse.producer.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else{
                // false: 无产品，生产产品，改变mark状态，唤醒消费者线程
                System.out.println("生产者线程生产...");
                WareHouse.mark = true;
                WareHouse.consumer.signal();
            }
            WareHouse.lock.unlock();
        }
    }
}
