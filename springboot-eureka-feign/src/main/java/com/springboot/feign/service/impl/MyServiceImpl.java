package com.springboot.feign.service.impl;

import com.springboot.feign.MyFeign;
import com.springboot.feign.service.MyService;
import java.util.Date;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    @Autowired
    private MyFeign myFeign;

    @Override
    public String info() {
        String res = myFeign.getInfo();
        System.out.println(res);
        return res;
    }

    @Override
    public String addPerson(Map<String, Object> map) {
        map.put("firstName", "san");
        map.put("lastName", "zhang");
        map.put("age", 12);
        map.put("birthDay", new Date());
        return myFeign.addPerson(map);
    }
}
