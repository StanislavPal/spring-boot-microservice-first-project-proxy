package com.springboot.microservice.first.project.proxy.feign;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient( name="my-hello-service")
@RibbonClient(name="my-hello-service")
public interface HelloServiceProxy {
    @GetMapping("/hello")
    public String askMessage();
}
