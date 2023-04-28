package com.dreamblitz.webflux17.adapter.controller;

import com.dreamblitz.webflux17.common.exception.WF17ErrorDetails;
import com.dreamblitz.webflux17.common.exception.WF17InvalidInputException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import reactor.core.publisher.Mono;


@RestControllerAdvice
public class GenericExceptionController {

    @ExceptionHandler(value = {WF17InvalidInputException.class})
    public ResponseEntity<String> handleWF17InvalidInputException(
        WF17InvalidInputException wf17InvalidInputException) {
        // TO DO Modify this method
        WF17ErrorDetails[] wf17ErrorDetails = wf17InvalidInputException.getErrors();
        return new ResponseEntity<>("wf17ErrorDetails",
            wf17InvalidInputException.getHttpErrorCode());
    }
}
