package com.ptl.practice.designpatterns.observer;

/**
 * created by panta on 2019/2/12.
 *
 * @author panta
 */
public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);
    void notify(String message);
}
