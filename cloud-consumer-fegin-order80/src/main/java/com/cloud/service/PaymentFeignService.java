package com.cloud.service;

import com.cloud.model.bean.common.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author sqq
 * @Date 2021/9/3
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping("api/payment/search/{id}")
    CommonResult getById(@PathVariable(value = "id") Integer id);
}
