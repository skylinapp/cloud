package com.skylin.cloud.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "failCallback")
    public String getHelloWord() {
        return restTemplate.getForObject("http://HELLO-SERVICE/hello", String.class);
    }

    public String failCallback() {
        return "service is not availiable!";
    }
}
