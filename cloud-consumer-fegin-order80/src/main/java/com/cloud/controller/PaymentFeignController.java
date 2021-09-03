package com.cloud.controller;

import com.cloud.model.bean.common.CommonResult;
import com.cloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author sqq
 * @Date 2021/9/3
 */
@RestController
public class PaymentFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/feign/search/{id}")
    public CommonResult getById(@PathVariable Integer id){
        return paymentFeignService.getById(id);
    }
}
