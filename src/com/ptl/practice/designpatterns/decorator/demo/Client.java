package com.ptl.practice.designpatterns.decorator.demo;

/**
 * created by panta on 2019/2/11.
 *
 * @author panta
 */
public class Client {

    public static void main(String[] args) {
        Programmer programmer = new Tom();

        programmer.programme();

        AbstractDecorator abstractDecorator = new HackerDecorator(programmer);

        abstractDecorator.programme();

        AbstractDecorator decorator = new SoftwareArchitect(abstractDecorator);

        decorator.programme();

        AbstractDecorator decorator3 = new SoftwareArchitect(new HackerDecorator(new Tom()));

        decorator3.programme();
    }
}
