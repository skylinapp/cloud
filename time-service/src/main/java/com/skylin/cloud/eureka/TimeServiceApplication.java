package com.skylin.cloud.eureka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class TimeServiceApplication {
    @Value("${server.port}")
    private String port;

    public static void main(String[] args) {
        SpringApplication.run(TimeServiceApplication.class, args);
    }

    @RequestMapping("/time")
    public String getTime() {
        Calendar calendar = Calendar.getInstance();
        return calendar.toString();
    }

    @RequestMapping("hello")
    public String sayHello() {
        return "service running at:" + port;
    }
}
