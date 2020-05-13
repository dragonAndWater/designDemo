package com.company.strategy策略模式.strategyPMC;

import com.company.strategy策略模式.model.PayModel;
import com.company.strategy策略模式.model.ResultModel;

/**
 * @Author longtao
 * @Date   2020/5/13
 * @Describe 定义接口方法
 **/
public interface StrategyDesignInterface {

    ResultModel payMoney(PayModel model);

    ResultModel queryDealResult(PayModel model);
}
