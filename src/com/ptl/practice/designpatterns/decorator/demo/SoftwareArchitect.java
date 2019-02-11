package com.ptl.practice.designpatterns.decorator.demo;

/**
 * created by panta on 2019/2/11.
 *
 * @author panta
 */
public class SoftwareArchitect extends AbstractDecorator {
    public SoftwareArchitect(Programmer programmer) {
        super(programmer);
    }

    @Override
    public void programme() {
        super.programme();
        System.out.println("i am a SoftwareArchitecter");
    }
}
