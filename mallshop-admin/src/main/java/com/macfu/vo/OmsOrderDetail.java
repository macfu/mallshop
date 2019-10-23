package com.macfu.vo;

import com.macfu.model.po.OmsOrder;
import com.macfu.model.po.OmsOrderItem;
import com.macfu.model.po.OmsOrderOperateHistory;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 订单详情
 */

@Data
public class OmsOrderDetail extends OmsOrder {
    @Getter
    @Setter
    private List<OmsOrderItem> omsOrderItemList;
    @Getter
    @Setter
    private List<OmsOrderOperateHistory> historyList;
}
