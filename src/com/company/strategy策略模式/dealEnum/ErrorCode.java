package com.company.strategy策略模式.dealEnum;

public enum ErrorCode {

    ERROR_CODE_000000("000000", "交易成功", StatusEnum.SUCCESS),

    ERROR_CODE_999999("999999", "交易处理中", StatusEnum.PROCESSING),

    ERROR_CODE_LT0001("LT0001", "参数检查失败", StatusEnum.FAIL),

    ERROR_CODE_LT0002("LT0002", "业务检查失败", StatusEnum.FAIL),

    ERROR_CODE_LT0003("LT0003", "系统异常", StatusEnum.FAIL),

    ERROR_CODE_LT0004("LT0001", "参数检查失败", StatusEnum.FAIL),

    ERROR_CODE_LT0005("LT0001", "参数检查失败", StatusEnum.FAIL),

    ERROR_CODE_LT0006("LT0001", "参数检查失败", StatusEnum.FAIL),

    ERROR_CODE_LT0007("LT0001", "参数检查失败", StatusEnum.FAIL),

    ERROR_CODE_LT0011("LT0001", "参数检查失败", StatusEnum.FAIL);


    private String code;
    private String msg;
    private StatusEnum status;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    ErrorCode(String code, String msg, StatusEnum status) {
        this.code = code;
        this.msg = msg;
        this.status = status;
    }
}
