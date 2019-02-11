package com.ptl.practice.designpatterns.builder;

/**
 * created by panta on 2019/2/11.
 *
 * @author panta
 */
public class Client {

    public static void main(String[] args) {
        People peopleBuilder = new PeopleBuilder(new People()).setAge(23).setHeight(158).setWeight(100).setName("张三").build();

        System.out.println("people = [" + peopleBuilder.getName() + "]");
    }
}
