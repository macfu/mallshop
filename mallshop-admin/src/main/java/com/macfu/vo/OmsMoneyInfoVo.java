package com.macfu.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 修改订单费用信息参数
 */
@Data
public class OmsMoneyInfoVo {
    private Long orderId;
    private BigDecimal freightAmount;
    private BigDecimal discountAmount;
    private Integer status;
}
