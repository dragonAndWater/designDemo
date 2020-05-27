package com.行为型模式.strategy策略模式.definedException;

import com.行为型模式.strategy策略模式.dealEnum.ErrorCode;
import com.行为型模式.strategy策略模式.dealEnum.StatusEnum;


public class DataCheckException extends Exception {
    static final long serialVersionUID = -3387516993124229948L;

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


    public DataCheckException() {
        super();
    }

    public DataCheckException(String message) {
        this.code = ErrorCode.ERROR_CODE_LT0001.getCode();
        this.msg = ErrorCode.ERROR_CODE_LT0001.getMsg() + ":" + message;
        this.status = ErrorCode.ERROR_CODE_LT0001.getStatus();
    }

    public DataCheckException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataCheckException(Throwable cause) {
        super(cause);
    }

    protected DataCheckException(String message, Throwable cause,
                                 boolean enableSuppression,
                                 boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
