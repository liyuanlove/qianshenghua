package com.qianshenghua.qsheureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class QshEurekaApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(QshEurekaApplication.class).web(true).run(args);
    }
}
