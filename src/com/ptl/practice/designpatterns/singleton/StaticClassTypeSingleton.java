package com.ptl.practice.designpatterns.singleton;

/**
 * created by panta on 2019/1/15.
 *
 * @author panta
 */
public class StaticClassTypeSingleton {

    private StaticClassTypeSingleton() {
    }

    private static class Instance{

        private static  StaticClassTypeSingleton staticClassTypeSingleton = new StaticClassTypeSingleton();
    }

    public static  StaticClassTypeSingleton getInstance(){
        return Instance.staticClassTypeSingleton;
    }

    public void doSomething(){
        System.out.printf("hhhhhh");
    }
}
