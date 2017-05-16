package com.hulk.cloud.hystrix.dashboard;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@SpringBootApplication
@EnableTurbineStream
@EnableHystrixDashboard
public class HystrixDashboardApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(HystrixDashboardApplication.class).run(args);
    }
}