package com.ptl.practice.abs.a;

import java.util.Random;

/**
 * create by panta on 2019/11/20
 */
public class Customer {
    private HandlerChain handlerChain;

    public void setHandlerChain(HandlerChain handlerChain) {
        this.handlerChain = handlerChain;
    }

    public void request(float discount) {
        handlerChain.doHandler(discount);
    }

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Customer customer = new Customer();
            customer.setHandlerChain(HandlerChainFactory.createHandlerChain());
            customer.request(random.nextFloat());
        }
    }
}
