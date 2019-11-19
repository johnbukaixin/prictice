package com.ptl.practice.abs.rule;

import com.ptl.practice.abs.model.OrderBaseBo;
import com.ptl.practice.abs.model.OrderShareAmountDetail;

/**
 * created by panta on 2019/11/19.
 * 针对 附加项分摊、优惠券、积分等分摊
 * @author panta
 */
public interface BaseAmountRule {

    OrderShareAmountDetail caculateBasePrice(OrderBaseBo orderBaseBo);
}
