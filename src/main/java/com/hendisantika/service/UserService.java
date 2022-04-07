package com.hendisantika.service;

import com.hendisantika.domain.Role;
import com.hendisantika.domain.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt-demo2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/04/22
 * Time: 10.30
 */
public interface UserService {
    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();
}
