package com.example.orderservice.controller;

import com.alibaba.fastjson.JSON;
import com.example.feignclient.UserApi;
import com.example.orderservice.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("order")
public class UserController {

    @Autowired
    private UserDao userDao;

    @Value("${user.name}")
    String name1;

    @Resource
    private UserApi userApi;

    /**
     * 获取用户信息
     * @return RetResponse
     */
    @GetMapping("/getUserInfo")
    @ResponseBody
    public String getUserInfo() {
        List list = new ArrayList();
        Object o = list.get(0);
        return JSON.toJSONString(name1);
    }

    /**
     * 获取用户信息
     * @return RetResponse
     */
    @GetMapping("/getUserInfo1")
    @ResponseBody
    public String getUserInfo1() {
        String userInfo = userApi.getUserInfo();
        return JSON.toJSONString(userInfo);
    }
}
