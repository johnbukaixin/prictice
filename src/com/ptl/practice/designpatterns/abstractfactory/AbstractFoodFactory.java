package com.ptl.practice.designpatterns.abstractfactory;

/**
 * created by panta on 2019/2/12.
 *  abstract factory
 * @author panta
 */
public abstract class AbstractFoodFactory {

    abstract AbstractFood getFood(String name);
}
