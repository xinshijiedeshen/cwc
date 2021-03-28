package com.cwc.admin.mp.impl;

import com.cwc.admin.entity.PermissionRelation;
import com.cwc.admin.mapper.PermissionRelationMapper;
import com.cwc.admin.mp.IPermissionRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) 服务实现类
 * </p>
 *
 * @author 新世界的神
 * @since 2021-03-02
 */
@Service
public class PermissionRelationServiceImpl extends ServiceImpl<PermissionRelationMapper, PermissionRelation> implements IPermissionRelationService {

}
