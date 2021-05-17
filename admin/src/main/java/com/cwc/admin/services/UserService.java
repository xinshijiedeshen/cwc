package com.cwc.admin.services;

import com.cwc.admin.entity.Permission;
import com.cwc.admin.entity.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserService {

    User getUserByUserName(String userName);

    String login(String userName, String password);

    UserDetails loadUserByUsername(String username);

    List<Permission> getPermission(Long adminId);
}
