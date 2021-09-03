package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author sqq
 * @Date 2021/8/31
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationZkOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationZkOrder80.class, args);
    }
}
