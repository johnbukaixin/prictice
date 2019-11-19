package com.ptl.practice.abs.calculator;

/**
 * create by panta on 2019/11/19
 */

public class CouponCalculator extends AmountCalculatorBase {
    @Override
    public boolean isSupport() {
        return true;
    }

    @Override
    public Integer calculator(Integer a, RuleChain chain) {
        if (isSupport()) {
            System.out.println("aaaaaaaaaaaaaaa" +a);
            return a;
        } else {
            return chain.doHandler(a);

        }
    }


}
