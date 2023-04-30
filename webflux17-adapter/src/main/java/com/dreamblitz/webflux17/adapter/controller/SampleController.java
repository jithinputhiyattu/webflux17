package com.dreamblitz.webflux17.adapter.controller;

import com.dreamblitz.webflux17.common.exception.WF17UnhandledException;
import com.dreamblitz.webflux17.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/web-flux17")
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @RequestMapping(value = "/sample", method = RequestMethod.GET)
    public Mono<ResponseEntity<String>> getDistributionsStatus() throws WF17UnhandledException {
       return sampleService.sampleResponse().map( text -> new ResponseEntity<>(text + " Jai", HttpStatus.OK));
    }

}
