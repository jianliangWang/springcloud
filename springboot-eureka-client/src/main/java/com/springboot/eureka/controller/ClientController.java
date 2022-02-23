package com.springboot.eureka.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.eureka.vo.Person;
import java.util.Random;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Value("${student.name}")
    private String name;

    @Value("${student.address}")
    private String address;

    @GetMapping("getInfo")
    public String getInfo(HttpServletRequest request) {
        int time = RandomUtils.nextInt(1200);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(request.getAuthType());
        System.out.println(request.getHeader("auth"));
        return "getInfo: " + name + " your address is: " + address;
    }

    @PostMapping("addPerson")
    public String addPerson(@RequestBody Person person, HttpServletRequest request) throws Exception {
        System.out.println(request.getHeader("auth"));
        System.out.println("firstName:" + person.getFirstName());
        System.out.println("lastName:" + person.getLastName());
        System.out.println("age:" + person.getAge());
        System.out.println("birthDay:" + person.getBirthDay());
        return new ObjectMapper().writeValueAsString(person);
    }
}
