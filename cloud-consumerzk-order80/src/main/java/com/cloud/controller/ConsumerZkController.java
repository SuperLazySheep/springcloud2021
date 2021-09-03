package com.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author sqq
 * @Date 2021/8/31
 */
@RestController
public class ConsumerZkController {

    private static final String INVOKE_URL = "http://cloud-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/zk")
    public String get(){
        return restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
    }
}
