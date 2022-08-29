package com.zhh.practice.designMode.observerMode;

/**
 * @description:
 * @see:com.zhh.practice.designMode.observeMode
 * @author:zhh
 * @createTime:2022-08-24 14:26
 * @version:1.0
 */
public class ConcreteObserver implements Observer{


    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
