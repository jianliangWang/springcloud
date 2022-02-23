package com.springboot.feign.controller;

import com.springboot.feign.service.MyService;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/info")
    public String info() {
        return myService.info();
    }

    @GetMapping("addPerson")
    public String addPerson() {
        return myService.addPerson(new HashMap<>());
    }
}
