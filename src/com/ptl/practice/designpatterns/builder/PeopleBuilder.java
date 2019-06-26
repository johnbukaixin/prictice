package com.ptl.practice.designpatterns.builder;

public class PeopleBuilder {
    private People people;
    public PeopleBuilder setName(String name){
        this.people.setName(name);
        return this;
    }

    public PeopleBuilder setAge(Integer age){
        this.people.setAge(age);
        return this;
    }

    public PeopleBuilder setHeight(Integer height){
        this.people.setHeight(height);
        return this;
    }

    public PeopleBuilder setWeight(Integer weight){
        this.people.setWeight(weight);
        return this;
    }

    public People build(){
        return people;
    }

    public PeopleBuilder(People people) {
        this.people = people;
    }
}