package com.dreamblitz.webflux17.service;

import com.dreamblitz.webflux17.common.exception.WF17ErrorCodes;
import com.dreamblitz.webflux17.common.exception.WF17ErrorDetails;
import com.dreamblitz.webflux17.common.exception.WF17Exception;
import com.dreamblitz.webflux17.common.exception.WF17InvalidInputException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class SampleService extends IService {

    public Mono<String> sampleResponse() {
        return errorHandler(new Throwable("error 0"));
       // return  Mono.just("Jithin ....");
   }

    public WF17Exception createErrorResponse2(Throwable throwable) {
        return new WF17InvalidInputException(HttpStatus.BAD_REQUEST,
                new WF17ErrorDetails(WF17ErrorCodes.UNKNOWN_ERROR,throwable.getMessage()));
    }


    @Override
    public WF17Exception createErrorResponse(Throwable throwable) {
         return new WF17InvalidInputException(HttpStatus.BAD_REQUEST,
            new WF17ErrorDetails(WF17ErrorCodes.UNKNOWN_ERROR,"Testing error"));
    }
}
