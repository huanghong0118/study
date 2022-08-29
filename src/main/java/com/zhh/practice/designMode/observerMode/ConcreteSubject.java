package com.zhh.practice.designMode.observerMode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @see:com.zhh.practice.designMode.observeMode
 * @author:zhh
 * @createTime:2022-08-24 14:25
 * @version:1.0
 */
public class ConcreteSubject implements Subject{

    private List<Observer> observers = new ArrayList<>();


    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for(Observer observer : observers){
            observer.update(message);
        }
    }
}
