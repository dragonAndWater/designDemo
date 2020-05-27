package com.行为型模式.strategy策略模式.model;

import com.行为型模式.strategy策略模式.dealEnum.ErrorCode;
import com.行为型模式.strategy策略模式.dealEnum.StatusEnum;

/**
 * @Author longtao
 * @Date 2020/5/13
 * @Describe 处理结果Model
 **/
public class ResultModel {
    /*
     * 交易返回码
     */
    private String ret_code;
    /*
     * 交易返回信息
     */
    private String ret_msg;
    /*
     * 交易状态
     */
    private StatusEnum status;
    /*
     * 平台流水号
     */
    private String ref_no;
    /*
     * 上游渠道流水号
     */
    private String channelNo;
    /*
     * 备注
     */
    private String remark;

    /*
     * 无参构造器
     */
    public ResultModel() {
    }

    /*
     * 有参构造器
     */
    public ResultModel(String ret_code, String ret_msg) {
        this.ret_code = ret_code;
        this.ret_msg = ret_msg;
    }

    /*
     * 有参构造器
     */
    public ResultModel(ErrorCode errorCode) {
        this.ret_code = errorCode.getCode();
        this.ret_msg = errorCode.getMsg();
        this.status = errorCode.getStatus();
    }

    public String getRet_code() {
        return ret_code;
    }

    public void setRet_code(String ret_code) {
        this.ret_code = ret_code;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public String getRef_no() {
        return ref_no;
    }

    public void setRef_no(String ref_no) {
        this.ref_no = ref_no;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "ResuleModel{" +
                "ret_code='" + ret_code + '\'' +
                ", ret_msg='" + ret_msg + '\'' +
                ", status='" + status + '\'' +
                ", ref_no='" + ref_no + '\'' +
                ", channelNo='" + channelNo + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
