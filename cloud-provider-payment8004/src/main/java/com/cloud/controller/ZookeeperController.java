package com.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sqq
 * @Date 2021/8/30
 */
@RestController
public class ZookeeperController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/zk")
    public String get(){
        return "spring-cloud-zk " + port;
    }
}
