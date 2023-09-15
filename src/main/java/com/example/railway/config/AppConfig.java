package com.example.railway.config;

import com.example.railway.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.railway.entity.User;

import java.util.Random;
import java.util.stream.IntStream;

@Configuration
public class AppConfig {
    private final UserRepository userRepository;

    public AppConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Bean
    public CommandLineRunner runner() {
        return args -> {
            if (userRepository.findByUsername("username1").isEmpty()) {
                IntStream.range(0, 10).forEach(i -> {
                    userRepository.save(
                           new User(new Random().nextLong(), "username$i", "email$i@email.com")
                    );
                });
            }
        };
    }
}
