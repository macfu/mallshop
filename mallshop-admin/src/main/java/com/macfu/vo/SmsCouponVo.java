package com.macfu.vo;

import com.macfu.model.po.SmsCoupon;
import com.macfu.model.po.SmsCouponProductCategoryRelation;
import com.macfu.model.po.SmsCouponProductRelation;
import lombok.Data;

import java.util.List;

/**
 * 优惠券信息封装，包括绑定的商品和绑定分类
 */
@Data
public class SmsCouponVo extends SmsCoupon {
    // 优惠券绑定的商品
    private List<SmsCouponProductRelation> productRelationList;
    // 优惠券绑定的商品分类
    private List<SmsCouponProductCategoryRelation> productCategoryRelationList;

}
