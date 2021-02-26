package com.cwc.admin;

import com.cwc.admin.entity.User;
import com.cwc.admin.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {AdminApplication.class})
class AdminApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {

    }

}
