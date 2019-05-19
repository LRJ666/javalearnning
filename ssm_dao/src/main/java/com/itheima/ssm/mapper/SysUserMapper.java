package com.itheima.ssm.mapper;

import com.itheima.ssm.pojo.SysUser;

import java.util.List;

public interface SysUserMapper {

    SysUser querySysUserByUsername(String username) throws Exception;

    List<SysUser> queryUserList() throws Exception;

    void saveUser(SysUser sysUser) throws Exception;
}
