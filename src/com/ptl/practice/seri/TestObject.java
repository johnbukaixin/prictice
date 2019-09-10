package com.ptl.practice.seri;

import java.io.Serializable;

/**
 * created by panta on 2019/9/10.
 *
 * @author panta
 */
public class TestObject implements Serializable {
    private static final long serialVersionUID = -4048586661569436160L;

    private static int count = 20;


    private transient String hello;

    private String world;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        TestObject.count = count;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    @Override
    public String toString() {
        return "TestObject{" + "hello='" + hello + '\'' + ", world='" + world + '\'' + ", count='" + count + '\''+'}';
    }
}
