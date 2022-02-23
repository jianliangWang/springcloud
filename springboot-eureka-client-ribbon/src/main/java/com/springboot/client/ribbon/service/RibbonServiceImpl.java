package com.springboot.client.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonServiceImpl implements IRibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${eureka.client.url}")
    private String url;

    @Override
    public String getInfo() {
        String result = restTemplate.getForObject(url, String.class);
        return result;
    }

    @Override
    public String errorHandler() {
        return "Server error";
    }
}
