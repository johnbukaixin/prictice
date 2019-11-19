package com.ptl.practice.abs.a;

/**
 * create by panta on 2019/11/20
 */
public class CEO implements Handler {
    @Override
    public void handle(float discount, HandlerChain chain) {
        if (discount < 0.5f) {
            System.out.println("CEO批准折扣:" + discount);
        } else {
            System.out.println("CEO拒绝了折扣:" + discount);
        }
    }
}
