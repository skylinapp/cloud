package com.skylin.cloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="HELLO-SERVICE", fallback = FeignCallBack.class)
public interface FeignService {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello();
}
