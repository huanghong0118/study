package com.zhh.practice.designMode.singlton;

/**
 * @description:
 * @see:com.zhh.practice.designMode.singlton
 * @author:zhh
 * @createTime:2022-08-29 13:50
 * @version:1.0
 */
public class SingletonTest01 {

    public static void main(String[] args) {

        /**
         *多次获取 实例相同
        */
        Singleton instance01 = Singleton.getInstance();
        Singleton instance02 = Singleton.getInstance();
        System.out.println(instance01 == instance02);
    }

}

class Singleton{

    /**
     *写法：饿汉式 （构造器私有化 防止new方式创建对象）
     * 优缺点说明：
     * 优点：简单 避免线程同步问题 类装载时就已经完成实例化
     * 缺点:没有懒加载 造成内存浪费 从始至终 未使用时 该类就已经存在
    */
    private final static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
}
