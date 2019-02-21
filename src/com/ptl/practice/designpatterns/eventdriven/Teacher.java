package com.ptl.practice.designpatterns.eventdriven;

import java.util.ArrayList;
import java.util.List;

/**
 * created by panta on 2019/2/21.
 * 发布事件者（事件源），维护监听者列表（得知道谁需要）
 * @author panta
 */
public class Teacher {

    private String name;

    public String getName() {
        return name;
    }

    private List<String> homeworks = new ArrayList<>();

    public Teacher(String name) {
        this.name = name;
    }

    List<HomeworkEventListener> listeners = new ArrayList<>();

    void setHomework(String homework){

        System.out.println(this.name + "布置" + homework);
        homeworks.add(homework);

        HomeworkEventObject homeworkEventObject = new HomeworkEventObject(this);

        for (HomeworkEventListener listener : listeners){
            listener.update(homeworkEventObject,homework);
        }
    }

    public void addObserver(HomeworkEventListener homeworkListener){
        listeners.add(homeworkListener);
    }
}
