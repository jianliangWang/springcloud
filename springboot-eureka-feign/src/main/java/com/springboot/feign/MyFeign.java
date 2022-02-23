package com.springboot.feign;

import java.util.Map;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "spring-eureka-client", fallback = MyFeignImpl.class)
public interface MyFeign {

    @GetMapping("/getInfo")
    String getInfo();

    @PostMapping("addPerson")
    String addPerson(Map<String, Object> person);
}
