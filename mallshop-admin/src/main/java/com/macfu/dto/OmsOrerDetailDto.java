package com.macfu.dto;

import com.macfu.model.po.OmsOrder;
import com.macfu.model.po.OmsOrderItem;
import com.macfu.model.po.OmsOrderOperateHistory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author macfu
 * @description:
 * @date 2019/5/22
 */
public class OmsOrerDetailDto extends OmsOrder {

    @Getter
    @Setter
    private List<OmsOrderItem> orderItemList;
    @Getter
    @Setter
    private List<OmsOrderOperateHistory> historyList;
}
