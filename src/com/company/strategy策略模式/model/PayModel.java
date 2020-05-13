package com.company.strategy策略模式.model;

/**
 * @Author longtao
 * @Date 2020/5/13
 * @Describe 支付Model-父类
 **/
public class PayModel {
    /*
     * 平台流水号
     */
    String refNo;
    /*
     * 上游渠道流水号
     */
    String channelNo;
    /*
     * 通道号
     */
    String pmcNo;
    /*
     * 通道名
     */
    String PmcName;

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }

    public String getPmcNo() {
        return pmcNo;
    }

    public void setPmcNo(String pmcNo) {
        this.pmcNo = pmcNo;
    }

    public String getPmcName() {
        return PmcName;
    }

    public void setPmcName(String pmcName) {
        PmcName = pmcName;
    }

    @Override
    public String toString() {
        return "PayModel{" +
                "refNo='" + refNo + '\'' +
                ", channelNo='" + channelNo + '\'' +
                ", pmcNo='" + pmcNo + '\'' +
                ", PmcName='" + PmcName + '\'' +
                '}';
    }
}
