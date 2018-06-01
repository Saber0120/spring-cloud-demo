package com.sheng.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sheng on 2018/6/1.
 */
@RestController
public class HelloController {

    @Value("${sarah}")
    private String foo;

    @GetMapping("/hi")
    public String sayHello() {
        return foo;
    }
}
