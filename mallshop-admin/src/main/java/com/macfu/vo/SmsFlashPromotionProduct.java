package com.macfu.vo;

import com.macfu.model.po.PmsProduct;
import com.macfu.model.po.SmsFlashPromotionProductRelation;
import lombok.Data;

/**
 * 限时购及商品信息封装
 */
@Data
public class SmsFlashPromotionProduct extends SmsFlashPromotionProductRelation {
    private PmsProduct pmsProduct;
}
