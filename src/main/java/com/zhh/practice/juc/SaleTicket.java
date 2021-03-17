package com.zhh.practice.juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: 问题：三个售票员  卖出30张票 （线程操作资源类）
 * @see:com.zhh.practice.juc
 * @author:zhh
 * @createTime:2021-03-16 14:56
 * @version:1.0
 */
public class SaleTicket {

    public static void main(String[] args) {

        Ticket ticket = new Ticket();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i <= 40; i++){
                    ticket.saleTicket1();
                    //Thread.sleep(500);
                }
            }
        },"A").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i <= 40; i++){
                    ticket.saleTicket1();
                }
            }
        },"B").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i <= 40; i++){
                    ticket.saleTicket1();
                }
            }
        },"C").start();

        //改写为lambda表达式
        new Thread(()->{
            for(int i = 0; i <= 40; i++){
                ticket.saleTicket1();
            }
        },"D").start();
    }
}

//资源类
class Ticket{

    private int ticketNum = 30;
    Lock lock = new ReentrantLock();

    public synchronized void saleTicket(){
        if(ticketNum > 0){
            ticketNum--;
            System.out.println(Thread.currentThread().getName()+"卖出了，剩余票数为"+ticketNum);
        }
    }

    public void saleTicket1(){
        lock.lock();
        try{
            if(ticketNum > 0){
                System.out.println(Thread.currentThread().getName()+"卖出了，剩余票数为"+(--ticketNum));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }


    }
}
