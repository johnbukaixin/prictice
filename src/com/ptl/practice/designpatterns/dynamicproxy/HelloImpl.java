package com.ptl.practice.designpatterns.dynamicproxy;

/**
 * created by panta on 2019/6/26.
 *
 * @author panta
 */
public class HelloImpl implements Hello{
    @Override
    public void sayHello() {
        System.out.println("say hello!");
    }

    @Override
    public void sayGoodbye() {

        System.out.println("say goodbye!");
    }
}
