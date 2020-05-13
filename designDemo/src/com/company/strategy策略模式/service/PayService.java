package com.company.strategy策略模式.service;

import com.company.strategy策略模式.adapter.AdapterControl;
import com.company.strategy策略模式.model.PayModel;
import com.company.strategy策略模式.model.ResultModel;

public class PayService {

    /**
     * @Author longtao
     * @Date   2020/5/13
     * @Describe 交易处理
     **/
    public ResultModel deal(PayModel model) {
        AdapterControl adapter = AdapterControl.getAdapter(model.getPmcNo());
        return adapter.payMoney(model);
    }

    public ResultModel query(PayModel model) {
        AdapterControl adapter = AdapterControl.getAdapter(model.getPmcNo());
        return adapter.queryDealResult(model);
    }
}
