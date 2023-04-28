package com.dreamblitz.webflux17.common.exception;

import org.springframework.http.HttpStatus;

public abstract class WF17Exception extends Exception {

    private final HttpStatus httpErrorCode;

    private final WF17ErrorDetails[] errors;

    public WF17Exception(HttpStatus httpErrorCode, WF17ErrorDetails[] errors) {
        this.httpErrorCode = httpErrorCode;
        this.errors = errors;
    }
}
