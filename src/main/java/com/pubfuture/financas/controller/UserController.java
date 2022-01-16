package com.pubfuture.financas.controller;

import com.pubfuture.financas.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User user1 = new User(1L,"Wagner","wagnerdsodre@gmail.com","password") ;
         return ResponseEntity.ok().body(user1);

    }
}
