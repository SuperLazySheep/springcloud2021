package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author sqq
 * @Date 2021/8/23
 */
@SpringBootApplication
@EnableEurekaClient
public class ApplicationConsumerOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationConsumerOrder80.class, args);
    }
}
