package com.sqq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author sqq
 * @Date 2021/8/25
 */
@EnableEurekaServer
@SpringBootApplication
public class ApplicationEurekaServer7001 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationEurekaServer7001.class, args);
    }
}
