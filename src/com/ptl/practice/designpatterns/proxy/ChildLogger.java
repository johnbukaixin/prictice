package com.ptl.practice.designpatterns.proxy;

/**
 * created by panta on 2019/2/12.
 *
 * @author panta
 */
public class ChildLogger implements Logger {
    @Override
    public void printLog() {
        System.out.println("print some log before execute");
    }
}
