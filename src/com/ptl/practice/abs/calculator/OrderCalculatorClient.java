package com.ptl.practice.abs.calculator;

import com.ptl.practice.abs.a.Customer;
import com.ptl.practice.abs.a.HandlerChainFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * created by panta on 2019/11/19.
 *
 * @author panta
 */
public class OrderCalculatorClient {

    private RuleChain ruleChain;

    private void request(Integer amount){
        ruleChain.doHandler(amount);
    }


    public void setRuleChain(RuleChain ruleChain) {
        this.ruleChain = ruleChain;
    }

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            OrderCalculatorClient customer = new OrderCalculatorClient();
            List<AmountCalculator> calculators = new ArrayList<>();
            calculators.add(new CouponCalculator());
            customer.setRuleChain(new RuleChainImpl(calculators));
            customer.request(i);
        }
    }



}
