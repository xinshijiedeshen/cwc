package com.cwc.admin.mapper;

import com.cwc.admin.entity.Permission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 新世界的神
 * @since 2021-03-02
 */
public interface PermissionMapper extends BaseMapper<Permission> {
    List<Permission> selectByAdminId(String adminId);
}
