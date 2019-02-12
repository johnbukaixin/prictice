package com.ptl.practice.designpatterns.observer;

/**
 * created by panta on 2019/2/12.
 *
 * @author panta
 */
public class MessageObserver implements Observer {
    private String username;

    public MessageObserver(String username) {
        this.username = username;
    }

    @Override
    public void update(String message) {
        System.out.println(this.username + "message = [" + message + "]");
    }
}
