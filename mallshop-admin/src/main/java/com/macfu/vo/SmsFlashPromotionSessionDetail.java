package com.macfu.vo;

import com.macfu.model.po.SmsFlashPromotionSession;
import lombok.Getter;
import lombok.Setter;

public class SmsFlashPromotionSessionDetail extends SmsFlashPromotionSession {
    @Setter
    @Getter
    private Long productCount;
}
