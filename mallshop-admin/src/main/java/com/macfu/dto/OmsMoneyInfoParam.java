package com.macfu.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OmsMoneyInfoParam {
    private Long orderId;
    private BigDecimal freightAmount;
    private BigDecimal discountAmount;
    private Integer status;
}
