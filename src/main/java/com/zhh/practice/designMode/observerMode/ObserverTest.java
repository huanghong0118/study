package com.zhh.practice.designMode.observerMode;

/**
 * @description:
 * @see:com.zhh.practice.designMode.observeMode
 * @author:zhh
 * @createTime:2022-08-24 14:38
 * @version:1.0
 */
public class ObserverTest {


    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer = new ConcreteObserver();
        //添加好友
        subject.attach(observer);
        //发通知
        subject.notifyObserver("通知通知");


    }
}
