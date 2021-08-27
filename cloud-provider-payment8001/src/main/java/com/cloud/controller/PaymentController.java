package com.cloud.controller;

import com.cloud.model.bean.common.CommonResult;
import com.cloud.model.bean.jpa.Payment;
import com.cloud.service.inter.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author sqq
 * @Date 2021/8/24
 *
 */
@RestController
@Slf4j
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @PostMapping("create")
    public CommonResult create(@RequestBody Payment payment){
        paymentService.create(payment);
        return new CommonResult(200, "成功");
    }

    @GetMapping("search/{id}")
    public CommonResult getById(@PathVariable Integer id){
        Payment payment = paymentService.getById(id);
        return new CommonResult(200, "成功" + port, payment);
    }
}
