package com.zhh.practice.designMode.singlton;

/**
 * @description:
 * @see:com.zhh.practice.designMode.singlton
 * @author:zhh
 * @createTime:2022-08-29 15:17
 * @version:1.0
 */
public class SingletonTest04 {
}

class Singleton04 {

    /**
     * 写法：懒汉式 双重判断 线程安全
     * 优点：懒加载 需要的时候才去创建 效率高 推荐使用
     * 缺点：
     */
    private static volatile Singleton04 instance;

    private Singleton04() {
    }

    /**
     * 线程安全写法 同步关键字
     */
    public static synchronized Singleton04 getInstance01() {
        if (instance == null) {
            synchronized (Singleton04.class){
                if (instance == null) {
                    instance = new Singleton04();
                }
            }
        }
        return instance;
    }
}