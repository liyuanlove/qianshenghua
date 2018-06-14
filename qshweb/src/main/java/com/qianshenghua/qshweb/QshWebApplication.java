package com.qianshenghua.qshweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * 激活Eureka 中的DiscoveryClient 实现（自动化配置， 创建DiscoveryClient 接口针对Eureka 客户端的EurekaDiscoveryClient 实例）
 **/
@ComponentScan("com.qianshenghua.*")
@EnableDiscoveryClient
@SpringBootApplication
public class QshWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(QshWebApplication.class, args);
    }
}
