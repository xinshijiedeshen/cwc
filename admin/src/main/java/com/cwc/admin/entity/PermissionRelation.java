package com.cwc.admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
 * </p>
 *
 * @author 新世界的神
 * @since 2021-03-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("admin_permission_relation")
@ApiModel(value="PermissionRelation对象", description="后台用户和权限关系表(除角色中定义的权限以外的加减权限)")
public class PermissionRelation implements Serializable {

    private static final long serialVersionUID = 4480106315217570653L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long adminId;

    private Long permissionId;

    private Integer type;


}
