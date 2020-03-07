package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import springcloud.service.PaymentService;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    PaymentService paymentService;
    @Value("${server.port})")
    private String serverPort;

    @PostMapping("payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        if(result>0){
            log.info("插入成功");
            return new CommonResult(200,"success,serverPort"+serverPort,result);
        } else {
            log.info("插入失败");
            return new CommonResult(444,"failure",null);
        }
    }
    @GetMapping("payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        if(payment != null){
            log.info("查询成功");
            return new CommonResult(200,"success,serverPort"+serverPort,payment);
        } else {
            log.info("查询失败");
            return new CommonResult(444,"failure",null);
        }
    }

}
