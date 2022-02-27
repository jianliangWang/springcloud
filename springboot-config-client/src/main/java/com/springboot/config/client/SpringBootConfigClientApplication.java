package com.springboot.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;


@SpringBootApplication
public class SpringBootConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfigClientApplication.class, args);
    }
}
