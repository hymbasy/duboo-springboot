package com.alex.springbootredis.service;

import com.alex.springbootapi.FeedbackService;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)

public class FeedbackServiceImpl implements FeedbackService {
    @Override
    public String getFeedback() {
        Map<String, Object> resultMap = new HashMap<>(16);
        resultMap.put("name", "alex");
        resultMap.put("age", 28);
        resultMap.put("address", "北京市海淀区");
        return JSON.toJSONString(resultMap);
    }
}
