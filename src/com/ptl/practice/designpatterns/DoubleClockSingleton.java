package com.ptl.practice.designpatterns;

/**
 * created by panta on 2019/1/15.
 * 双重加锁单例
 * @author panta
 */
public class DoubleClockSingleton {

    private volatile static DoubleClockSingleton doubleClockSingleton;

    private DoubleClockSingleton() {
    }

    public synchronized static  DoubleClockSingleton getInstance(){
        if (doubleClockSingleton == null){
            synchronized (DoubleClockSingleton.class){
                if (doubleClockSingleton ==  null){
                     doubleClockSingleton = new DoubleClockSingleton();
                }
            }
        }
        return doubleClockSingleton;
    }


}
