package com.zhh.practice.designMode.singlton;


import java.util.concurrent.SynchronousQueue;

/**
 * @description:
 * @see:com.zhh.practice.designMode.singlton
 * @author:zhh
 * @createTime:2022-08-29 15:07
 * @version:1.0
 */
public class SingletonTest03 {


}

class Singleton03{

    /**
     * 写法：懒汉式 非线程安全写法 提供一个静态方法 使用时创建实例
     * 优点：懒加载 需要的时候才去创建
     * 缺点：效率太低
     */
    private static Singleton03 instance;

    private Singleton03(){}

    /**
     *  非线程安全写法
    */
    public static Singleton03 getInstance(){
        if(instance == null){
            instance = new Singleton03();
        }
        return instance;
    }

    /**
     *  线程安全写法 同步关键字
     */
    public static synchronized Singleton03 getInstance01(){
        if(instance == null){
            instance = new Singleton03();
        }
        return instance;
    }
}
