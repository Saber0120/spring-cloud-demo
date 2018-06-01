package com.sheng.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceHi01Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceHi01Application.class, args);
	}
}
