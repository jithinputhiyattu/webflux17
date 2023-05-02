package com.dreamblitz.webflux17.common.utils;

import org.springframework.stereotype.Component;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;

@Component
public class FluxAndBackPressure {

  BaseSubscriber baseSubscriber;

  public Flux<Integer>  get100Ints() {
    return Flux.range(1, 100);
  }
}
