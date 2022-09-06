package com.zhh.practice.designMode.singlton;

/**
 * @description:
 * @see:com.zhh.practice.designMode.singlton
 * @author:zhh
 * @createTime:2022-08-29 15:02
 * @version:1.0
 */
public class SingletonTest02 {

    public static void main(String[] args) {

        /**
         *多次获取 实例相同
         */
        Singleton02 instance01 = Singleton02.getInstance();
        Singleton02 instance02 = Singleton02.getInstance();
        System.out.println(instance01 == instance02);
    }
}

class Singleton02 {

    /**
     * 写法：饿汉式（静态代码块实现） （构造器私有化 防止new方式创建对象）
     * 类实例化过程放到了静态代码块中
     *
     */
    private static Singleton02 instance ;

    static{
        //静态代码块中创建单例对象
        instance = new Singleton02();
    }

    private Singleton02() {
    }

    public static Singleton02 getInstance() {
        return instance;
    }
}