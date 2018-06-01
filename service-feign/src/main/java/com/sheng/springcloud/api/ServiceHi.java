package com.sheng.springcloud.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by sheng on 2018/6/1.
 */
@FeignClient(value = "service-hi")
public interface ServiceHi {

    @GetMapping("/hi")
    String sayHiFromClient(@RequestParam (value = "name") String name);
}
