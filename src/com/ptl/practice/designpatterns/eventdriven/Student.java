package com.ptl.practice.designpatterns.eventdriven;

/**
 * created by panta on 2019/2/21.
 * 监听者
 * @author panta
 */
public class Student implements HomeworkEventListener{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(HomeworkEventObject object, Object args) {
       Teacher teacher = object.getTeacher();
        System.out.printf("学生%s观察到（实际是被通知）%s布置了作业《%s》 \n", this.name, teacher.getName(), args);
    }
}
