package com.ptl.practice.abs.a;

import java.util.Iterator;
import java.util.List;

/**
 * create by panta on 2019/11/20
 */
public class HandlerChainImpl implements HandlerChain{
    private Iterator<Handler> iterator;

    public HandlerChainImpl(List<Handler> handlers) {
        this.iterator = handlers.iterator();
    }

    public void doHandler(float discount) {
        if (iterator.hasNext()) {
            Handler handler = iterator.next();
            handler.handle(discount, this);
        }
    }

}
