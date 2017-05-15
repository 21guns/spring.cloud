package com.hulk.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
//feign包含熔断
@EnableFeignClients
public class FeignApplication {
    public static void main(String[] args) {
		SpringApplication.run(FeignApplication.class, args);
	}
}