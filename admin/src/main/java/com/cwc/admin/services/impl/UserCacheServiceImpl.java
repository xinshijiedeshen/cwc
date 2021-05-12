package com.cwc.admin.services.impl;

import com.cwc.admin.entity.User;
import com.cwc.admin.services.UserCacheService;
import com.cwc.common.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserCacheServiceImpl implements UserCacheService {

    @Autowired
    private RedisService redisService;

    @Value("${redis.database}")
    private String REDIS_DATABASE;

    @Value("${redis.key.adminName}")
    private String REDIS_KEY_ADMINNAME;

    @Value("${redis.expire.common}")
    private Long REDIS_EXPIRE;

    @Override
    public User getAdmin(String username) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_ADMINNAME + ":" + username;
        User o = (User)redisService.get(key);
        return o;
    }

    @Override
    public void setAdmin(User user) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_ADMINNAME + ":" + user.getUsername();
        redisService.set(key, user, REDIS_EXPIRE);
    }
}
