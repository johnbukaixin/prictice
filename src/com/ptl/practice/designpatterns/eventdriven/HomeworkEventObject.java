package com.ptl.practice.designpatterns.eventdriven;

import java.util.EventObject;

/**
 * created by panta on 2019/2/21.
 * 事件对象
 * @author panta
 */
public class HomeworkEventObject extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public HomeworkEventObject(Object source) {
        super(source);
    }

    Teacher getTeacher(){
        return (Teacher) super.getSource();
    }
}
