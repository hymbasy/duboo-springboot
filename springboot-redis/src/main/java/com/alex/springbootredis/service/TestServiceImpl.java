package com.alex.springbootredis.service;

import com.alex.springbootapi.TestService;
import com.alibaba.dubbo.config.annotation.Service;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class TestServiceImpl implements TestService {
    @Override
    public String sayHello() {
        String s = "hello world";
        return s;
    }
}
