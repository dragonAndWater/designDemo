package com.company.strategy策略模式.definedException;

public class DataCheckException extends Exception {
    static final long serialVersionUID = -3387516993124229948L;

    String ret_code = "000001";

    public DataCheckException() {
        super();
    }

    public String getRet_code() {
        return ret_code;
    }

    public void setRet_code(String ret_code) {
        this.ret_code = ret_code;
    }

    public DataCheckException(String message) {
        super(message);
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
