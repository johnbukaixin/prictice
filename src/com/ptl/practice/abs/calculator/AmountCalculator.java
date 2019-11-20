package com.ptl.practice.abs.calculator;

/**
 * created by panta on 2019/11/19.
 *
 * @author panta
 */
public interface AmountCalculator {

    boolean isSupport(Integer a);

    Integer calculator(Integer a, CalculatorChain chain);
}
