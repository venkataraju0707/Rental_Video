// src/main/java/com/rentvideo/repositories/UserRepository.java

package com.rentvideo.repositories;

import com.rentvideo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}