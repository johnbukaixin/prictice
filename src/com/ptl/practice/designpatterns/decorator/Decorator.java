package com.ptl.practice.designpatterns.decorator;

/**
 * created by panta on 2019/2/11.
 *
 * @author panta
 */
public class Decorator implements Componet{

    private Componet componet;

    public Decorator() {
    }

    public Decorator(Componet componet) {
        this.componet = componet;
    }

    @Override
    public void SimpleOperation() {
       componet.SimpleOperation();
    }
}
