package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
public class ServiceFeignApplication implements SchedualServiceHi{

	public static void main(String[] args) {
		SpringApplication.run(ServiceFeignApplication.class, args);
	}

	@Override
	public String sayHiFromClientOne(String name) {
		 return "sorry "+name;
	}
}
