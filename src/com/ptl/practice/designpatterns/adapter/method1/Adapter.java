package com.ptl.practice.designpatterns.adapter.method1;

/**
 * created by panta on 2019/2/11.
 *
 * @author panta
 */
public class Adapter extends Source implements Target {

    @Override
    public void printRed() {
        System.out.println("print red");
        this.print();
    }

}
