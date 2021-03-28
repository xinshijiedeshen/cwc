package com.cwc.admin.mp.impl;

import com.cwc.admin.entity.User;
import com.cwc.admin.mapper.UserMapper;
import com.cwc.admin.mp.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 新世界的神
 * @since 2021-03-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
