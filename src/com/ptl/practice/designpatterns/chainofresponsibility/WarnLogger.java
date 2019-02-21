package com.ptl.practice.designpatterns.chainofresponsibility;

/**
 * created by panta on 2019/2/21.
 *
 * @author panta
 */
public class WarnLogger extends  AbstractLogger {
    @Override
    protected void write(String message) {
        System.out.println("warn logger:" + message);
    }

    public WarnLogger(int level) {
        this.level = level;
    }
}
