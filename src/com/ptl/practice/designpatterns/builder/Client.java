package com.ptl.practice.designpatterns.builder;

/**
 * created by panta on 2019/2/11.
 * Spring BeanDefinitionBuilder
 * @author panta
 */
public class Client {

    public static void main(String[] args) {
        People people = new PeopleBuilder(new People()).setAge(23).setHeight(158).setWeight(100).setName("Tom").build();

        System.out.println("people = [" + people.getName() + "]");
    }
}
