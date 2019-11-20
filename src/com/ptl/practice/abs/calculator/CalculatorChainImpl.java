package com.ptl.practice.abs.calculator;

import java.util.Iterator;
import java.util.List;

/**
 * create by panta on 2019/11/19
 */
public class CalculatorChainImpl implements CalculatorChain {

    private Iterator<AmountCalculator> iterators;


    public CalculatorChainImpl(List<AmountCalculator> calculators) {
        this.iterators = calculators.iterator();
    }

    @Override
    public Integer doHandler(Integer discount) {
        if (iterators.hasNext()) {
            AmountCalculator calculator = iterators.next();
            return calculator.calculator(discount, this);

        }
        return null;
    }
}
