package com.sdw.soft.wekeeper.common.permission.service;

import java.util.List;

import com.sdw.soft.wekeeper.common.auth.vo.RoleToPermission;
import com.sdw.soft.wekeeper.common.permission.vo.Permission;

/**
 * @author shangyd
 * @date 2015年11月9日 下午5:52:52
 **/
public interface PermissionService {

	public int savePermission(Permission permission);
	public List<Permission> listPermission();
	public Permission findPermissionById(long id);
	
	
	public int saveRoleToPermission(RoleToPermission roleToPermission);
	public List<Permission> findPermissionByRoleId(long roleId);
}
