package com.ptl.practice.designpatterns.chainofresponsibility;

/**
 * created by panta on 2019/2/21.
 *
 * @author panta
 */
public class InfoLogger extends  AbstractLogger {

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard info::Logger: " + message);

    }
}
