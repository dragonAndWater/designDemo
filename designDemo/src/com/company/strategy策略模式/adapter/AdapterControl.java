package com.company.strategy策略模式.adapter;


import com.company.strategy策略模式.model.PayModel;
import com.company.strategy策略模式.model.ResultModel;
import com.company.strategy策略模式.strategyPMC.StrategyDesignInterface;

/**
 * @Author longtao
 * @Date   2020/5/13
 * @Describe 根据传进来的String确定返回哪个PMCAdapter
 **/
public class AdapterControl implements StrategyDesignInterface {
    //反射获取对应的PMCAdapter
    public static AdapterControl getAdapter(String pmcNo){
        AdapterControl adapter = new AdapterControl();
        try {
            Class<?> reflect = Class.forName("com.company.strategy策略模式.adapter."+pmcNo+"PMCAdapter");
            Object o = reflect.newInstance();
            adapter = (AdapterControl) o;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return adapter;
    }

    @Override
    public ResultModel payMoney(PayModel model) {
        return null;
    }

    @Override
    public ResultModel queryDealResult(PayModel model) {
        return null;
    }
}
