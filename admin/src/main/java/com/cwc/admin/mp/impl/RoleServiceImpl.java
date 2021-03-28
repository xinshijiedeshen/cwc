package com.cwc.admin.mp.impl;

import com.cwc.admin.entity.Role;
import com.cwc.admin.mapper.RoleMapper;
import com.cwc.admin.mp.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户角色表 服务实现类
 * </p>
 *
 * @author 新世界的神
 * @since 2021-03-09
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
