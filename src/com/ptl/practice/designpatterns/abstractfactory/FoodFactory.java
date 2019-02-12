package com.ptl.practice.designpatterns.abstractfactory;

/**
 * created by panta on 2019/2/12.
 *
 * @author panta
 */
public class FoodFactory extends AbstractFoodFactory {
    @Override
    AbstractFood getFood(String name) {
        if (name.equals("rice")){
            return new Rice();
        }else if (name.equals("noodles")){
            return new Noodles();
        }
        return null;
    }
}
