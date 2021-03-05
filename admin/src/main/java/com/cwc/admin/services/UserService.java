package com.cwc.admin.services;

import com.cwc.admin.entity.User;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserService {

    User getUserByUserName(String userName);

    String login(String userName, String password);

    UserDetails loadUserByUsername(String username);
}
