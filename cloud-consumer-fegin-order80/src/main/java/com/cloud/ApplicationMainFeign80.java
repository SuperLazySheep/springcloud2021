package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author sqq
 * @Date 2021/9/3
 */
@SpringBootApplication
@EnableFeignClients
public class ApplicationMainFeign80 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMainFeign80.class, args);
    }
}
