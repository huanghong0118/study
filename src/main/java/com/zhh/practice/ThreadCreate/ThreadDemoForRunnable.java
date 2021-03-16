package com.zhh.practice.ThreadCreate;

/**
 * @description:通过实现runnable创建线程
 * @see:com.zhh.practice.Thread
 * @author:zhh
 * @createTime:2021-03-11 15:00
 * @version:1.0
 */
public class ThreadDemoForRunnable implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i < 10000;i++){
            System.out.println(i+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ThreadDemoForRunnable threadDemoForRunnable = new ThreadDemoForRunnable();
        new Thread(threadDemoForRunnable).start();
    }
}
