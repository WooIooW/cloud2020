package com.wy.springcloud.service;

import com.wy.springcloud.entities.CommonResult;
import com.wy.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping(value = "/payment/getPaymentById/{id}")
    public CommonResult<Payment>  getPaymentById(@PathVariable("id") long id);
}
