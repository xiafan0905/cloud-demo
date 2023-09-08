package com.example.userservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.userservice.pojo.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends BaseMapper<SysUser> {
}
