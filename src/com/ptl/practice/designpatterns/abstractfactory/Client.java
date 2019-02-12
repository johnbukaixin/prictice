package com.ptl.practice.designpatterns.abstractfactory;

/**
 * created by panta on 2019/2/12.
 *
 * @author panta
 */
public class Client {
    public static void main(String[] args) {
        AbstractFoodFactory foodFactory = new FoodFactory();

        Rice rice = (Rice) foodFactory.getFood("rice");

        System.out.println(rice + " " + foodFactory.getFood(""));
    }
}
