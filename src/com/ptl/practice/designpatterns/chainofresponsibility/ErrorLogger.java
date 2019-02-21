package com.ptl.practice.designpatterns.chainofresponsibility;

/**
 * created by panta on 2019/2/21.
 *
 * @author panta
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);

    }
}
