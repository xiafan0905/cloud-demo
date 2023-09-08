package com.example.feignclient;

import com.example.feignclient.factory.OrderFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "orderService", fallbackFactory = OrderFactory.class)
public interface OrderApi {

    @GetMapping("/order/getUserInfo")
    String getUserInfo();
}
