package com.springboot.microservice.first.project.proxy.feign;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient( name="my-bye-service")
@RibbonClient(name="my-bye-service")
public interface ByeServiceProxy {
    @GetMapping("/bye")
    public String askMessage();
}
