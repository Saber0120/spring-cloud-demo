package com.sheng.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceHi02Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceHi02Application.class, args);
	}
}
