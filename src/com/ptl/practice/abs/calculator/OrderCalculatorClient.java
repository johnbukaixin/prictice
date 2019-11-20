package com.ptl.practice.abs.calculator;

import java.util.ArrayList;
import java.util.List;

/**
 * created by panta on 2019/11/19.
 *
 * @author panta
 */
public class OrderCalculatorClient {

    private CalculatorChain calculatorChain;

    private void request(Integer amount){
        calculatorChain.doHandler(amount);
    }


    public void setRuleChain(CalculatorChain ruleChain) {
        this.calculatorChain = ruleChain;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            OrderCalculatorClient customer = new OrderCalculatorClient();
            List<AmountCalculator> calculators = new ArrayList<>();
            calculators.add(new CouponCalculator());
            calculators.add(new IntegralCalculator());
            customer.setRuleChain(new CalculatorChainImpl(calculators));
            customer.request(i);
        }
    }



}
