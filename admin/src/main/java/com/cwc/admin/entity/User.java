package com.cwc.admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 新世界的神
 * @since 2021-02-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("admin_user")
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "真名")
    @TableField("realName")
    private String realName;

    @ApiModelProperty(value = "头像")
    private String icon;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "昵称")
    @TableField("nickName")
    private String nickName;

    @ApiModelProperty(value = "备注信息")
    private String note;

    @TableField("loginTime")
    private LocalDateTime loginTime;

    @TableField("updateTime")
    private LocalDateTime updateTime;

    @TableField("createTime")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "test")
    private String test;


}
