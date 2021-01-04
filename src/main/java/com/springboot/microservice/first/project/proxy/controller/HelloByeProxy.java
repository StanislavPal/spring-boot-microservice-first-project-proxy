package com.springboot.microservice.first.project.proxy.controller;

import com.springboot.microservice.first.project.proxy.feign.ByeServiceProxy;
import com.springboot.microservice.first.project.proxy.feign.HelloServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class HelloByeProxy {

    @Autowired
    private HelloServiceProxy helloServiceProxy;

    @Autowired
    private ByeServiceProxy byeServiceProxy;

    @RequestMapping("/hello")
    public String askHello() {
        return helloServiceProxy.askMessage();
    }

    @RequestMapping("/bye")
    public String askBye() {
        return byeServiceProxy.askMessage();
    }
}
