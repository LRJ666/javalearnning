package com.itheima.ssm.mapper;

import com.itheima.ssm.pojo.SysPermission;

import java.util.List;

public interface PermissionMapper {

    List<SysPermission> queryPermissionList() throws Exception;

    List<SysPermission> queryParentPermissionList() throws Exception;

    void savePermission(SysPermission sysPermission) throws Exception;
}
