package com.zhh.practice.designMode.singlton;

/**
 * @description:枚举实现
 * @see:com.zhh.practice.designMode.singlton
 * @author:zhh
 * @createTime:2022-09-05 9:11
 * @version:1.0
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        /**
         *多次获取 实例相同
         */
        Singleton06 instance01 = Singleton06.INSTANCE;
        Singleton06 instance02 = Singleton06.INSTANCE;
        System.out.println(instance01 == instance02);
    }
}

enum Singleton06{
    INSTANCE;
}
