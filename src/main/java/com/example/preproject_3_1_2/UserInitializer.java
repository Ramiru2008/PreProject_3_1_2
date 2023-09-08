package com.example.preproject_3_1_2;

import com.example.preproject_3_1_2.model.User;
import com.example.preproject_3_1_2.service.UserService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class UserInitializer implements InitializingBean {
    private final UserService userService;

    public UserInitializer(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        {
            userService.add(new User( "Roman","Kudasov", 43));
            userService.add(new User( "Ivan", "Petrov", 18));
            userService.add(new User("Peter", "Ivanov", 20));

        }

    }
}




