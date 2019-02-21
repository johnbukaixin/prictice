package com.ptl.practice.designpatterns.chainofresponsibility;

/**
 * created by panta on 2019/2/21.
 *
 * @author panta
 */
public class Client {

    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger warnLogger = new WarnLogger(AbstractLogger.WARN);
        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        infoLogger.setNextLogger(warnLogger);
        warnLogger.setNextLogger(errorLogger);
        return infoLogger;
    }
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");
        loggerChain.logMessage(AbstractLogger.WARN,
                "This is an warn level information.");
        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
