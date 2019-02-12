package com.ptl.practice.designpatterns.proxy;

/**
 * created by panta on 2019/2/12.
 *
 * @author panta
 */
public class Proxy implements Target{

    private Target target;

    private Logger logger;

    public Proxy(Target target, Logger logger) {
        this.target = target;
        this.logger = logger;
    }


    @Override
    public void execute() {
        logger.printLog();
        target.execute();
    }
}
