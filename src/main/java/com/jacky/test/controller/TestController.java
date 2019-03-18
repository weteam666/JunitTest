package com.jacky.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private RedisTemplate redisTemplate;


    @RequestMapping("/addkey")
    public String addKey(){
        redisTemplate.boundValueOps("One").set("第一次添加!");
        return "OK";
    }
    @RequestMapping("/getkey")
    public String getKey(){
        String msg = (String) redisTemplate.opsForValue().get("One");
        return msg;
    }

}
