package com.zhh.practice.designMode.singlton;

/**
 * @description:
 * @see:com.zhh.practice.designMode.singlton
 * @author:zhh
 * @createTime:2022-08-29 15:27
 * @version:1.0
 */
public class SingletonTest05 {



}

class Singleton05 {


    /**
     * 写法：静态内部类
     * 优点：懒加载（外部装载不会导致内部装载） 自动装载 JVM保证线程安全 调用getInstance才会去装载静态内部类 （装载类时 线程安全）
     */

    private Singleton05() {
    }

    public static class SingletonInstance{
        private static final Singleton05 INSTANCE = new Singleton05();
    }

    public static Singleton05 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
