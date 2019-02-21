package com.ptl.practice.designpatterns.eventdriven;

import java.util.EventListener;
import java.util.Objects;

/**
 * created by panta on 2019/2/21.
 *
 * @author panta
 */
public interface HomeworkEventListener extends EventListener {

    void update(HomeworkEventObject object, Object args);
}
