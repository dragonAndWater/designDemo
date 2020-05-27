package com.行为型模式.strategy策略模式.model;

import java.math.BigDecimal;

/**
 * @Author longtao
 * @Date 2020/5/13
 * @Describe 实时支付Model
 **/
public class RealTimePayModel extends PayModel {
    /*
     * 付款人账号
     */
    private String payerAcctNo;
    /*
     * 付款人户名
     */
    private String payerAcctName;
    /*
     * 收款人账号
     */
    private String payeeAcctNo;
    /*
     * 收款人户名
     */
    private String payeeAcctName;
    /*
     * 交易笔数
     */
    private String count;
    /*
     * 交易金额
     */
    private BigDecimal amount;

    public String getPayerAcctNo() {
        return payerAcctNo;
    }

    public void setPayerAcctNo(String payerAcctNo) {
        this.payerAcctNo = payerAcctNo;
    }

    public String getPayerAcctName() {
        return payerAcctName;
    }

    public void setPayerAcctName(String payerAcctName) {
        this.payerAcctName = payerAcctName;
    }

    public String getPayeeAcctNo() {
        return payeeAcctNo;
    }

    public void setPayeeAcctNo(String payeeAcctNo) {
        this.payeeAcctNo = payeeAcctNo;
    }

    public String getPayeeAcctName() {
        return payeeAcctName;
    }

    public void setPayeeAcctName(String payeeAcctName) {
        this.payeeAcctName = payeeAcctName;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "RealTimePayModel{" +
                "payerAcctNo='" + payerAcctNo + '\'' +
                ", payerAcctName='" + payerAcctName + '\'' +
                ", payeeAcctNo='" + payeeAcctNo + '\'' +
                ", payeeAcctName='" + payeeAcctName + '\'' +
                ", count='" + count + '\'' +
                ", amount=" + amount +
                '}';
    }
}
