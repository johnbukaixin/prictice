package com.ptl.practice.designpatterns.decorator;

/**
 * created by panta on 2019/2/1.
 *
 * @author panta
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.printf("draw:rectangle");
    }
}
