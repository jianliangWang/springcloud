package com.springboot.config.client.controller;

import com.springboot.config.client.configuration.ConfigClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private ConfigClient configClient;

    @GetMapping("getHost")
    public String getHost(){
        return configClient.getMongodb()+","+
            configClient.getMysql()+","+
            configClient.getRedis();
    }
}
