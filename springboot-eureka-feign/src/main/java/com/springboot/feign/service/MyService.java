package com.springboot.feign.service;

import java.util.Map;

public interface MyService {

    String info();

    String addPerson(Map<String, Object> map);
}
