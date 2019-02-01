package com.ptl.practice.designpatterns.decorator;

/**
 * created by panta on 2019/2/1.
 *
 * @author panta
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape shape;


    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }


    @Override
    public void draw() {
        shape.draw();
    }
}
