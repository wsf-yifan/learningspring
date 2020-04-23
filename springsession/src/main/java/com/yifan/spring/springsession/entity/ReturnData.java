package com.yifan.spring.springsession.entity;

import java.io.Serializable;

public class ReturnData implements Serializable {
    private Object data;
    private String message;
    private StatusCode statusCode;

    public ReturnData(StatusCode statusCode, Object data, String message) {
        this.data = data;
        this.message = message;
        this.statusCode = statusCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public StatusCode getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(StatusCode statusCode) {
        this.statusCode = statusCode;
    }
}

