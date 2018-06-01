package com.sheng.springcloud.controller;

import com.sheng.springcloud.api.ServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sheng on 2018/6/1.
 */
@RestController
public class HelloController {

    @Autowired
    private ServiceHi serviceHi;

    @GetMapping("/hi")
    public String sayHello(@RequestParam String name) {
        return serviceHi.sayHiFromClient(name);
    }
}
