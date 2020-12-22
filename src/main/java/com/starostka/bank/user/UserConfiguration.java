package com.starostka.bank.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class UserConfiguration {

    UserFacade userFacade() {
        return userFacade(new InMemoryUserRepository());
    }

    @Bean
    UserFacade userFacade(UserRepository userRepository) {
        return new UserFacade(userRepository, new UserCreator());
    }
}