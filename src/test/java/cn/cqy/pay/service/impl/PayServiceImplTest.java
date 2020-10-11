package cn.cqy.pay.service.impl;

import cn.cqy.pay.PayApplicationTests;
import cn.cqy.pay.service.IPayService;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;


public class PayServiceImplTest extends PayApplicationTests {

    @Autowired
    private IPayService payService;

    @Test
    public void create() {

        payService.create("987654321987654", BigDecimal.valueOf(0.01), BestPayTypeEnum.WXPAY_NATIVE);
    }
}