package com.pubfuture.financas.repository;

import com.pubfuture.financas.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
