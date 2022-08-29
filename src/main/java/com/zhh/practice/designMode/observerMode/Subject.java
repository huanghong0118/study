package com.zhh.practice.designMode.observerMode;

/**
 * @description:
 * @see:com.zhh.practice.designMode.observeMode
 * @author:zhh
 * @createTime:2022-08-24 14:25
 * @version:1.0
 */
public interface Subject {

    void attach(Observer observer);

    void notifyObserver(String message);
}
