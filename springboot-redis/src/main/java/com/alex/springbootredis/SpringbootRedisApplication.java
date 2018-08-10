package com.alex.springbootredis;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootRedisApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringbootRedisApplication.class, args);
        new SpringApplicationBuilder(SpringbootRedisApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
