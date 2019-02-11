package com.ptl.practice.designpatterns.decorator.demo;

/**
 * created by panta on 2019/2/11.
 *
 * @author panta
 */
public abstract class AbstractDecorator implements Programmer {

    private Programmer programmer;


    public AbstractDecorator(Programmer programmer) {
        this.programmer = programmer;
    }

    @Override
    public void programme() {
        programmer.programme();
    }
}
