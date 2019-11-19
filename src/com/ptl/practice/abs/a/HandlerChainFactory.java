package com.ptl.practice.abs.a;

import java.util.ArrayList;
import java.util.List;

/**
 * create by panta on 2019/11/20
 */
public class HandlerChainFactory {
    public static HandlerChain createHandlerChain() {
        List<Handler> handlers = new ArrayList<Handler>();
        handlers.add(new Saler());
        handlers.add(new CEO());
        return new HandlerChainImpl(handlers);
    }

}
