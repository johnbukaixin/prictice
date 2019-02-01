package com.ptl.practice.designpatterns.decorator;

/**
 * created by panta on 2019/2/1.
 *
 * @author panta
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.printf("draw:cricle");
    }
}
