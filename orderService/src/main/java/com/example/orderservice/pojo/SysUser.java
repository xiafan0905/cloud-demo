package com.example.orderservice.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 夏帆
 * @Description: 用户表
 * @time 2022/08/24 10:38
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysUser {

    /**
     * 主键
     */
    private String id;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 性别
     */
    private String sex;

    /**
     * 地址
     */
    private String address;

    /**
     * 手机号
     */
    private String telephone;
}
