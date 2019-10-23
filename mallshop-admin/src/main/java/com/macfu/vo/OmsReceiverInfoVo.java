package com.macfu.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * 订单修改收货人信息参数
 */
@Getter
@Setter
public class OmsReceiverInfoVo {
    private Long orderId;
    private String receiveName;
    private String receivePhone;
    private String receivePostCode;
    private String receiveDetailAddress;
    private String receiveProvince;
    private String receiveCity;
    private String receiveRegion;
    private Integer status;
}
