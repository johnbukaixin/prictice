package com.ptl.practice.designpatterns.adapter.method2;

/**
 * created by panta on 2019/2/11.
 *
 * @author panta
 */
public class Source2 implements Source {
    @Override
    public void printColor() {
        System.out.println("print blue");
    }
}
