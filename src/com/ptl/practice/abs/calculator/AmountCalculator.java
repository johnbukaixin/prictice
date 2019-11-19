package com.ptl.practice.abs.calculator;

import java.util.ArrayList;
import java.util.List;

/**
 * created by panta on 2019/11/19.
 *
 * @author panta
 */
public interface AmountCalculator {
    List<AmountCalculator> amountCalculators = new ArrayList<>();
    
    boolean isSupport();

    Integer calculator();
}