package com.alex.springbootconsumer.controller;

import com.alex.springbootapi.FeedbackService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConsumerController {

    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:12345")
    private FeedbackService feedbackService;

    @GetMapping("/test")
    public String index() {
        String feedback = feedbackService.getFeedback();
        return feedback;
    }

}
