package com.ptl.practice.designpatterns.test;

import com.ptl.practice.designpatterns.singleton.DoubleClockSingleton;
import com.ptl.practice.designpatterns.singleton.EnumTypeSingleton;
import com.ptl.practice.designpatterns.singleton.StaticClassTypeSingleton;

/**
 * created by panta on 2019/1/15.
 *
 * @author panta
 */
public class Test {


    public static void main(String[] args){

        DoubleClockSingleton doubleClockSingleton = DoubleClockSingleton.getInstance();

        EnumTypeSingleton.INSTANCE.doSomething();

        StaticClassTypeSingleton staticClassTypeSingleton = StaticClassTypeSingleton.getInstance();

    }
}
