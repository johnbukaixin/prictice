package com.ptl.practice.abs.rule;

import com.ptl.practice.abs.model.OrderBaseBo;
import com.ptl.practice.abs.model.OrderShareAmount;
import com.ptl.practice.abs.model.OrderShareAmountDetail;

import java.util.List;

/**
 * created by panta on 2019/11/19.
 *
 * @author panta
 */
public interface ShareAmountCalculator{

    OrderShareAmountDetail caculateBasePrice(OrderBaseBo orderBaseBo);

    OrderShareAmount getOrderShareAmount(String orderNum);





}
