package com.toloan.pay.exception;

public class SimpleMessageException extends RuntimeException {
    /**
     * 错误状态
     */
    private int errorCode;

    public SimpleMessageException() {
        super();
    }


    public SimpleMessageException(String message) {
        super(message);
    }

    /**
     * 构造函数
     * @param errorCode
     * @param message
     * @param
     */
    public SimpleMessageException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }


    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
