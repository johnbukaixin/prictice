package com.ptl.practice.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * created by panta on 2019/2/12.
 *
 * @author panta
 */
public class SubscriptionSubject implements Subject {

    List<Observer> observers = new ArrayList<>();
    @Override
    public void attach(Observer observer) {
       observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
       observers.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer o : observers){
            o.update(message);
        }
    }
}
