package cn.cqy.pay.service;

import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayResponse;

import java.math.BigDecimal;

public interface IPayService {
    /**
     * 创建发起支付
     *
     * @param orderId 订单号
     * @param amount  金额
     */
    PayResponse create(String orderId, BigDecimal amount,BestPayTypeEnum bestPayTypeEnum);

    String asyncNotify(String notifyData);
}
