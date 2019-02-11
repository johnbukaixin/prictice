package com.ptl.practice.designpatterns.adapter.method1.method2;

/**
 * created by panta on 2019/2/11.
 *
 * @author panta
 */
public class Source1 implements Source {

    void printRed(){
        System.out.println("print red");
    }

    @Override
    public void printColor() {
        this.printRed();
    }
}
