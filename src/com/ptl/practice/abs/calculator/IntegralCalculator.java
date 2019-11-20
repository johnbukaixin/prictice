package com.ptl.practice.abs.calculator;

/**
 * created by panta on 2019/11/20.
 *
 * @author panta
 */
public class IntegralCalculator extends AmountCalculatorBase {
    @Override
    public boolean isSupport(Integer a) {
        return a % 2 == 1;
    }

    @Override
    public Integer calculator(Integer a, CalculatorChain chain) {
        if (isSupport(a)) {
            System.out.println("bbbbbbb" +a);
            return a;
        } else {
            return chain.doHandler(a);

        }
    }
}
