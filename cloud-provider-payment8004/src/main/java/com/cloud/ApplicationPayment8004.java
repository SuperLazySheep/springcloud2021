package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author sqq
 * @Date 2021/8/30
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationPayment8004 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationPayment8004.class, args);
    }
}
