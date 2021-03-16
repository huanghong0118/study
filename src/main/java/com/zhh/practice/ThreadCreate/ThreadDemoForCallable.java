package com.zhh.practice.ThreadCreate;

import java.util.concurrent.*;

/**
 * @description:通过callabel创建线程
 * @see:com.zhh.practice.Thread
 * @author:zhh
 * @createTime:2021-03-11 15:18
 * @version:1.0
 */
public class ThreadDemoForCallable implements Callable<Boolean> {

    @Override
    public Boolean call() throws Exception {
        for(int i = 0;i < 10000;i++){
            System.out.println(i+Thread.currentThread().getName());
        }
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(1);
        Callable c = new ThreadDemoForCallable();
        Future f = pool.submit(c);
        System.out.println(f.get());
        pool.shutdown();
    }
}
