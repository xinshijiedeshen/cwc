package com.cwc.admin.services;

import com.cwc.admin.entity.User;

public interface UserCacheService {

    /**
     * 获取缓存后台用户信息
     */
    User getAdmin(String username);
}
