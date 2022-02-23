package com.springboot.client.ribbon.controller;

import com.springboot.client.ribbon.service.IRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonClientController {

    @Autowired
    private IRibbonService ribbonService;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("getInfo")
    public String getInfo() {
        return ribbonService.getInfo();
    }

    @GetMapping("serviceInfo")
    public String serviceInfo() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("spring-eureka-client");
        return serviceInstance.getHost() +":"+ serviceInstance.getPort();
    }
}
