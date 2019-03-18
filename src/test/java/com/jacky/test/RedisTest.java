package com.jacky.test;

import com.sun.media.sound.SoftTuning;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {


    @Autowired
    private RedisTemplate redisTemplate;


    @Test
    public void addKey(){
        redisTemplate.boundValueOps("One").set("第一次添加!");
        System.out.println("完成");

    }

    @Test
    public void getKey(){
        String msg = (String) redisTemplate.opsForValue().get("One");
        System.out.println(msg);
    }



}
