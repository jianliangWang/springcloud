package com.springboot.feign.configuration;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientInterceptorConfig implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        template.header("auth", "myAuth");
    }
}
