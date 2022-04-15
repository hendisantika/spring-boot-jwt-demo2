package com.hendisantika;

import com.hendisantika.domain.Role;
import com.hendisantika.domain.User;
import com.hendisantika.service.UserService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "User Service Spring Doc API", version = "2.0", description = "User Service " +
        "Information"))
@SecurityScheme(name = "User Service", scheme = "bearer", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
public class SpringBootJwtDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJwtDemo2Application.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_MANAGER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));
            userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

            userService.saveUser(new User(null, "Uzumaki Naruto", "naruto", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Hatake Kakashi", "kakashi", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Uchiha Sasuke", "sasuke", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "John Travolta", "john", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Will Smith", "will", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Jim Carry", "jim", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Arnold Schwarzenegger", "arnold", "1234", new ArrayList<>()));

            userService.addRoleToUser("naruto", "ROLE_SUPER_ADMIN");
            userService.addRoleToUser("naruto", "ROLE_ADMIN");
            userService.addRoleToUser("kakashi", "ROLE_ADMIN");
            userService.addRoleToUser("sasuke", "ROLE_MANAGER");
            userService.addRoleToUser("john", "ROLE_USER");
            userService.addRoleToUser("will", "ROLE_MANAGER");
            userService.addRoleToUser("jim", "ROLE_ADMIN");
            userService.addRoleToUser("arnold", "ROLE_SUPER_ADMIN");
            userService.addRoleToUser("arnold", "ROLE_ADMIN");
            userService.addRoleToUser("arnold", "ROLE_USER");
        };
    }
}
