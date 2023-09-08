package com.example.orderservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.orderservice.pojo.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends BaseMapper<SysUser> {
}
