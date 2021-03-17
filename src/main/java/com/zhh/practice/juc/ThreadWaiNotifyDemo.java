package com.zhh.practice.juc;

/**
 * @description:生产者消费者问题 两个线程分别加一和减一
 * @see:com.zhh.practice.juc
 * @author:zhh
 * @createTime:2021-03-17 13:40
 * @version:1.0
 */
public class ThreadWaiNotifyDemo {

    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        new Thread(()->{
            for(int i = 0; i < 10;i++){
                try {
                    airConditioner.decreament();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();
        new Thread(()->{
            for(int i = 0; i < 10;i++){
                try {
                    airConditioner.increament();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B").start();
    }
}
//资源类
class AirConditioner{

    private int temperature = 0;

    public synchronized void increament() throws InterruptedException {
        if(temperature > 0){
            this.wait();
        }
        temperature++;
        System.out.println(Thread.currentThread().getName()+"操作当前温度为:"+temperature);
        this.notifyAll();
    }

    public synchronized void decreament() throws InterruptedException {
        if(temperature == 0){
            this.wait();
        }
        temperature--;
        System.out.println(Thread.currentThread().getName()+"操作当前温度为:"+temperature);
        this.notifyAll();
    }
}
