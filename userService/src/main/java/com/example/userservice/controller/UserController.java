package com.example.userservice.controller;

import com.alibaba.fastjson.JSON;
import com.example.feignclient.OrderApi;
import com.example.userservice.mapper.UserDao;
import com.example.userservice.pojo.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;

@Controller
@RefreshScope
@RequestMapping("user")
public class UserController {

    @Value("${user.name}")
    private String userName;

    @Autowired
    private UserDao userDao;

    @Resource
    private OrderApi orderApi;

    /**
     * 获取用户信息
     * @return RetResponse
     */
    @GetMapping("/getUserInfo")
    @ResponseBody
    public String getUserInfo() {
        SysUser sysUser = userDao.selectById(1);
        return JSON.toJSONString(sysUser);
    }

    /**
     * 获取用户信息
     * @return RetResponse
     */
    @GetMapping("/getUserInfo1")
    @ResponseBody
    public String getUserInfo1() {
        String userInfo = orderApi.getUserInfo();
        return JSON.toJSONString(userInfo);
    }

    /**
     * 获取配置信息
     * @return String
     */
    @GetMapping("/getConfig")
    @ResponseBody
    public String getConfig() {
        return JSON.toJSONString(userName);
    }
}
