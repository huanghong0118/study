package com.zhh.practice.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:多线程之间顺调用 实现A-B-C A打印5次 B打印10次 C打印15次
 * @see:com.zhh.practice.juc
 * @author:zhh
 * @createTime:2021-03-18 8:55
 * @version:1.0
 */
public class ThreadOrderAccess {

    public static void main(String[] args) {
        ShareResource shareResource = new ShareResource();

        new Thread(()->{

            for(int i = 0;i < 10;i++){
                shareResource.print5();
            }

        },"A").start();
        new Thread(()->{

            for(int i = 0;i < 10;i++){
                shareResource.print10();
            }

        },"B").start();

        new Thread(()->{

            for(int i = 0;i < 10;i++){
                shareResource.print15();
            }

        },"C").start();
    }

}

//资源类
class ShareResource{

    private int num = 1;
    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();

    public void print5(){
        lock.lock();
        try {
            while(num != 1){
                condition1.await();
            }
            for(int i = 0; i < 5;i++){
                System.out.println(Thread.currentThread().getName()+"  "+num);
            }
            num = 2;
            condition2.signal();

        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }

    public void print10(){
        lock.lock();
        try {
            while(num != 2){
                condition2.await();
            }
            for(int i = 0; i < 10;i++){
                System.out.println(Thread.currentThread().getName()+"  "+num);
            }
            num = 3;
            condition3.signal();

        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }

    public void print15(){
        lock.lock();
        try {
            while(num != 3){
                condition3.await();
            }
            for(int i = 0; i < 15;i++){
                System.out.println(Thread.currentThread().getName()+"  "+num);
            }
            num = 1;
            condition1.signal();

        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }

}
