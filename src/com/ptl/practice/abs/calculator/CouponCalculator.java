package com.ptl.practice.abs.calculator;

/**
 * create by panta on 2019/11/19
 */

public class CouponCalculator extends AmountCalculatorBase {
    @Override
    public boolean isSupport(Integer a) {
        return a % 2 == 0;
    }

    @Override
    public Integer calculator(Integer a, CalculatorChain chain) {
        if (isSupport(a)) {
            System.out.println("aaaaaaaaaaaaaaa" +a);
            return a;
        } else {
            return chain.doHandler(a);

        }
    }


}
