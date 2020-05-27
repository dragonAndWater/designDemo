package com.行为型模式.strategy策略模式.adapter;

import com.行为型模式.strategy策略模式.dealEnum.ErrorCode;
import com.行为型模式.strategy策略模式.model.PayModel;
import com.行为型模式.strategy策略模式.model.ResultModel;
import com.行为型模式.strategy策略模式.strategyPMC.StrategyDesignInterface;

public class WechatPMCAdapter extends AdapterControl implements StrategyDesignInterface {

    @Override
    public ResultModel payMoney(PayModel model) {
        ResultModel ret = new ResultModel(ErrorCode.ERROR_CODE_LT0001);
        return ret;
    }

    @Override
    public ResultModel queryDealResult(PayModel model) {
        return null;
    }
}
