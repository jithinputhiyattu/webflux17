package com.dreamblitz.webflux17.adapter.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/web-flux17")
public class SampleController {

    public SampleController() {
        System.out.println("\n\nSampleController .....\n\n");
    }

    @RequestMapping(value = "/sample", method = RequestMethod.GET)
    public Mono<ResponseEntity<String>> getDistributionsStatus() {
        return Mono.just(new ResponseEntity<>("Working...", HttpStatus.OK));
    }

}
