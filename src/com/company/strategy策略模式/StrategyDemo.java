package com.company.strategy策略模式;

import com.company.strategy策略模式.dealEnum.ErrorCode;
import com.company.strategy策略模式.definedException.DataCheckException;
import com.company.strategy策略模式.model.PayModel;
import com.company.strategy策略模式.model.RealTimePayModel;
import com.company.strategy策略模式.model.ResultModel;
import com.company.strategy策略模式.service.PayService;
import com.company.strategy策略模式.util.DataCheck;

import java.math.BigDecimal;

public class StrategyDemo {

    private static PayService ps = new PayService();

    public static void main(String[] args) {
        //此处进行Model的初始化
        RealTimePayModel model = new RealTimePayModel();
        model.setPmcNo("Allinpay");
        model.setPmcName("平安支付");
        model.setRefNo("202005130199308120001");
        model.setPayerAcctNo("6210253100030056578");
        model.setPayerAcctName("付款人张三");
        model.setPayeeAcctNo("6303456070009039125");
        model.setPayeeAcctName("收款人李四");
        model.setAmount(new BigDecimal(100.00));

        //检查数据合法性
        ResultModel ret = checkData(model);
        System.out.println("查看检查结果：返回码-"+ret.getRet_code()+",返回信息-"+ret.getRet_msg());
        //调用处理流程
        ret = ps.deal(model);
        System.out.println("看看走的是哪个通道："+ret.getRet_msg()+",交易状态为："+ret.getStatus());



    }
    /**
     * @Author longtao
     * @Date   2020/5/13
     * @Describe 数据检查
     **/
    public static ResultModel checkData(PayModel model){
        try {
            RealTimePayModel realModel = (RealTimePayModel) model;
            //只检查最大长度
            DataCheck.checkLength("payerAcctNo",realModel.getPayerAcctNo(),19);
            //检查最小长度，最大长度
            DataCheck.checkLength("paeeAcctNo",realModel.getPayeeAcctNo(),1,16);
            //检查是否为空
            DataCheck.checkEmpty("channelNo",realModel.getChannelNo());
        }catch (DataCheckException e){
            return new ResultModel(e.getCode(),e.getMsg());
        }
        return new ResultModel(ErrorCode.ERROR_CODE_000000);
    }

}
