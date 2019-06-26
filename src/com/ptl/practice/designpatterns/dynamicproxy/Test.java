package com.ptl.practice.designpatterns.dynamicproxy;

/**
 * created by panta on 2019/6/26.
 *
 * @author panta
 */
public class Test {

    static public void main(String[] arg) {
        Hello hello = new HelloImpl();

        Hello ihello = LogProxy.bind(hello);
        ihello.sayHello();
        ihello.sayGoodbye();
    }
}
