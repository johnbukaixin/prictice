package com.ptl.practice.designpatterns.proxy;

/**
 * created by panta on 2019/2/12.
 *
 * @author panta
 */
public class TargetImpl implements Target {
    @Override
    public void execute() {
        System.out.println("execute target method");
    }
}
