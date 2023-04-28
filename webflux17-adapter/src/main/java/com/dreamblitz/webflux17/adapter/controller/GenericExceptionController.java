package com.dreamblitz.webflux17.adapter.controller;

import com.dreamblitz.webflux17.common.exception.WF17ErrorDetails;
import com.dreamblitz.webflux17.common.exception.WF17InvalidInputException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;


@RestControllerAdvice
public class GenericExceptionController {

    @ExceptionHandler(value = {WF17InvalidInputException.class})
    public ResponseEntity< List<WF17ErrorDetails>> handleWF17InvalidInputException(
        WF17InvalidInputException wf17InvalidInputException) {
        // TO DO Modify this method
        List<WF17ErrorDetails> wf17ErrorDetails = wf17InvalidInputException.getErrors();
        return new ResponseEntity<>(wf17ErrorDetails,
            wf17InvalidInputException.getHttpErrorCode());
    }
}
