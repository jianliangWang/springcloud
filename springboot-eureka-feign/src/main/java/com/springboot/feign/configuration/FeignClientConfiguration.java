package com.springboot.feign.configuration;

import feign.Logger;
import feign.Logger.Level;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfiguration {

    @Bean
    public Retryer feignClientRetryer(){
        return new Retryer.Default(200, 2000, 10);
    }

    @Bean
    public Logger.Level feignClientLogger(){
        return Level.FULL;
    }
}
