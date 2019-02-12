package com.ptl.practice.designpatterns.observer;

/**
 * created by panta on 2019/2/12.
 *
 * @author panta
 */
public class Client {

    public static void main(String[] args) {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();

        Observer user2 = new MessageObserver("张三");

        Observer user1 = new MessageObserver("里斯");

        subscriptionSubject.attach(user1);
        subscriptionSubject.attach(user2);

        subscriptionSubject.notify("消息更新");
    }
}
