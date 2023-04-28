package com.dreamblitz.webflux17.service;

import com.dreamblitz.webflux17.common.exception.WF17ErrorCodes;
import com.dreamblitz.webflux17.common.exception.WF17ErrorDetails;
import com.dreamblitz.webflux17.common.exception.WF17InvalidInputException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class SampleService implements IService {

    public Mono<String> sampleResponse() {
        return errorHandler(new Throwable());
       // return  Mono.just("Jithin ....");
   }

    @Override
    public Mono<String> errorHandler(Throwable throwable) {
        return Mono.error(
          new WF17InvalidInputException(HttpStatus.BAD_REQUEST,
            new WF17ErrorDetails(WF17ErrorCodes.UNKNOWN_ERROR,"Testing error")));
    }
}
