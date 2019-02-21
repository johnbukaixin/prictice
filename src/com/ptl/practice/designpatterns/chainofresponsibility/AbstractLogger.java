package com.ptl.practice.designpatterns.chainofresponsibility;

/**
 * created by panta on 2019/2/21.
 *
 * @author panta
 */
public abstract class AbstractLogger {

    protected static final int INFO = 0;

    protected static final  int WARN = 2;

    protected static final int ERROR = 3;

    protected int level;

    protected  AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);

}
