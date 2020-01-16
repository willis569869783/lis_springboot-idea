package com.entor.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.entor.entity.Role;
import com.entor.mapper.RoleMapper;
import com.entor.service.IRoleService;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Willis
 * @since 2020-01-07
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

	@Override
	public Map<String, Object> queryByPage(Integer page, Integer limit, Object... objects) {
		// TODO Auto-generated method stub
		return null;
	}

}