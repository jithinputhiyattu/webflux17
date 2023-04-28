package com.dreamblitz.webflux17.common.exception;


import lombok.Getter;

@Getter
public class WF17ErrorDetails {
    private static final long serialVersionUID = 2L;

    private Integer errorCode;
    private String errorMessage;

    public WF17ErrorDetails(Integer errCode, String errMsg) {
        this.errorCode = errCode;
        this.errorMessage = errMsg;
    }
}
