package com.cwc.admin.service.impl;

import com.cwc.admin.entity.User;
import com.cwc.admin.mapper.UserMapper;
import com.cwc.admin.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 新世界的神
 * @since 2021-02-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
