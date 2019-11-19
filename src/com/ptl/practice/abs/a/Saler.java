package com.ptl.practice.abs.a;

/**
 * create by panta on 2019/11/20
 */
public class Saler implements Handler {
    @Override
    public void handle(float discount, HandlerChain chain) {
        if (discount < 0.05f) {
            System.out.println("Saler批准折扣:" + discount);
        } else {
            chain.doHandler(discount);
        }

    }
}
