package com.atguigu.ssmshiro.mapper;


import com.atguigu.ssmshiro.pojo.SysPermission;

import java.util.List;

/**
 * <p>Title: SysPermissionMapperCustom</p>
 * <p>Description: 权限mapper</p>
 */
public interface SysPermissionMapperCustom {

    //根据用户id查询菜单
    public List<SysPermission> findMenuListByUserId(String userid) throws Exception;

    //根据用户id查询权限url
    public List<SysPermission> findPermissionListByUserId(String userid) throws Exception;
}
