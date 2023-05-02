package com.dreamblitz.webflux17.common.test.utils;

import com.dreamblitz.webflux17.common.utils.CustomSubscriber;
import com.dreamblitz.webflux17.common.utils.FluxAndBackPressure;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FluxAndBackPressureTest {

    @InjectMocks
    FluxAndBackPressure fluxAndBackPressure;

    @BeforeAll
    public void beforeAll() {
        MockitoAnnotations.openMocks(this);
    }

    @BeforeEach
    public void beforeEach() {

    }

    @Test
    public void shouldReturnOnly5(){
        fluxAndBackPressure.get100Ints().subscribe(CustomSubscriber.getSubSubscriber());
    }


}
