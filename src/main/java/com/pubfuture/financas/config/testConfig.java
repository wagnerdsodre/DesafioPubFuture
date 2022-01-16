package com.pubfuture.financas.config;

import com.pubfuture.financas.entities.User;
import com.pubfuture.financas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class testConfig implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Marcos", "marcos@gmail.com","Password");
        User u2 = new User(null, "Rita", "rita@gmail.com","Password");
        repository.saveAll(Arrays.asList(u1,u2));



    }
}
