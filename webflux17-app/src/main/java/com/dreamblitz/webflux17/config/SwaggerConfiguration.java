package com.dreamblitz.webflux17.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

@Configuration
@EnableOpenApi
public class SwaggerConfiguration {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any()).build().apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo("WebFlux17", "Sample Java 17 SpringBoot  Service", "1.0",
                "https://www.linkedin.com/in/jithinputhiyattu/",
                new Contact("Jithin Puthiyattu",
                        "https://www.linkedin.com/in/jithinputhiyattu/",
                        "jithinputhiyattu@.com"),
                "Dream Labs", "https://www.linkedin.com/in/jithinputhiyattu/",new ArrayList<>());
    }

}
