package com.skylin.cloud.feign;

import org.springframework.stereotype.Component;

@Component
public class FeignCallBack implements FeignService {

    @Override
    public String sayHello() {
        System.out.println("service is not availiabel!");
        return "service is not availiable!";
    }
}
