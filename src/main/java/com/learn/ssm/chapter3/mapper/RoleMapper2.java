package com.learn.ssm.chapter3.mapper;

import org.apache.ibatis.annotations.Select;

import com.learn.ssm.chapter3.pojo.Role;

/**
 * @author Young
 */
public interface RoleMapper2 {

	/**
	 * getRole
	 * @param id key
	 * @return Role
	 */
	@Select("select id, role_name as roleName, note from t_role where id=#{id}")
	Role getRole(Long id);
}
