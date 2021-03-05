package com.cwc.admin.services.impl;

import com.cwc.admin.entity.User;
import com.cwc.admin.services.UserCacheService;
import org.springframework.beans.factory.annotation.Value;

public class UserCacheServiceImpl implements UserCacheService {

    @Value("${redis.database}")
    private String REDIS_DATABASE;

    @Value("${redis.key.adminName}")
    private String REDIS_KEY_ADMINNAME;

    @Override
    public User getAdmin(String username) {

        return null;
    }
}
