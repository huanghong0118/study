package com.zhh.practice.juc.ThreadCreate;

/**
 * @description:通过继承方式创建线程
 * @see:com.zhh.practice.Thread
 * @author:zhh
 * @createTime:2021-03-11 14:35
 * @version:1.0
 */
public class ThreadDemoForExtends extends Thread{

    public void run(){
        for(int i = 0;i < 10000;i++){
            System.out.println(i+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ThreadDemoForExtends threadDemoForExtends = new ThreadDemoForExtends();
        threadDemoForExtends.start();

        //匿名内部类 代理模式
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i < 100;i++){
                    System.out.println("学习中"+Thread.currentThread().getName());
                }
            }
        },"B").start();


    }
}
