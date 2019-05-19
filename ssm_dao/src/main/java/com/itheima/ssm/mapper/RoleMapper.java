package com.itheima.ssm.mapper;

import com.itheima.ssm.pojo.SysRole;

import java.util.List;

public interface RoleMapper {

    List<SysRole> queryRoleList() throws Exception;

    void saveRole(SysRole sysRole) throws Exception;
}
