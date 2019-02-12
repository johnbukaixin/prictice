package com.ptl.practice.designpatterns.proxy;

/**
 * created by panta on 2019/2/12.
 *
 * @author panta
 */
public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new TargetImpl(),new ChildLogger());
        proxy.execute();
    }
}
