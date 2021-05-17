package com.cwc.admin.mapper;

import com.cwc.admin.entity.Permission;
import com.cwc.admin.entity.RoleRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 后台用户和角色关系表 Mapper 接口
 * </p>
 *
 * @author 新世界的神
 * @since 2021-03-02
 */
public interface RoleRelationMapper extends BaseMapper<RoleRelation> {

    /**
     * 获取用于所有权限
     */
    List<Permission> getPermissionList(@Param("adminId") Long adminId);

}
