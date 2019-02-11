package com.ptl.practice.designpatterns.decorator.demo;

/**
 * created by panta on 2019/2/11.
 * use the hacker decoration
 * @author panta
 */
public class HackerDecorator extends AbstractDecorator {
    @Override
    public void programme() {
        super.programme();
        System.out.println("i am a hacker");
    }

    public HackerDecorator(Programmer programmer) {
        super(programmer);
    }
}
