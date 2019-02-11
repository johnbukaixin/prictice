package com.ptl.practice.designpatterns.decorator;

/**
 * created by panta on 2019/2/11.
 *
 * @author panta
 */
public class ConcreteDecoratorA  extends Decorator{
    @Override
    public void SimpleOperation() {
       super.SimpleOperation();
    }

    public ConcreteDecoratorA(Componet componet) {
        super(componet);
    }
}
