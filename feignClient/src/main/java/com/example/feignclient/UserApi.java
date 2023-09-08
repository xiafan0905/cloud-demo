package com.example.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "userService")
public interface UserApi {

    @GetMapping("/user/getUserInfo")
    String getUserInfo();
}
