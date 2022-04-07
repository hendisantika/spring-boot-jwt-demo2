package com.hendisantika.repository;

import com.hendisantika.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt-demo2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/04/22
 * Time: 10.24
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
