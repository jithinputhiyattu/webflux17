package com.dreamblitz.webflux17.service;

import reactor.core.publisher.Mono;

public interface IService {

    public Mono<String> errorHandler(Throwable throwable);
}
