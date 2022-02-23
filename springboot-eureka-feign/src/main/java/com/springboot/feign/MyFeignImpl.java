package com.springboot.feign;

import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class MyFeignImpl implements MyFeign {

    @Override
    public String getInfo() {
        return "Server error";
    }

    @Override
    public String addPerson(Map<String, Object> person) {
        return "Person Server error";
    }
}
