package com.company.strategy策略模式.adapter;

import com.company.strategy策略模式.model.PayModel;
import com.company.strategy策略模式.model.ResultModel;
import com.company.strategy策略模式.strategyPMC.StrategyDesignInterface;

public class AllinpayPMCAdapter extends AdapterControl implements StrategyDesignInterface {
    @Override
    public ResultModel payMoney(PayModel model) {
        ResultModel ret = new ResultModel();
        ret.setRet_code("000000");
        ret.setRet_msg("Allinpay--交易成功");
        return ret;



    }

    @Override
    public ResultModel queryDealResult(PayModel model) {
        return null;
    }
}
