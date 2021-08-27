package com.cloud.controller;

import com.cloud.model.bean.common.CommonResult;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author sqq
 * @Date 2021/8/25
 */
@RestController
@RequestMapping("consumer/")
public class OrderController {

    public static final String URL =  "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("search/{id}")
    public CommonResult get(@PathVariable Integer id){
        return restTemplate.getForObject(URL + "/api/payment/search/" + id, CommonResult.class);
    }
}
