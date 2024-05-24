package com.bichinhos.gamification.repository;

import com.bichinhos.gamification.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User, Long>{
    Optional<User> findByMatricula (String matricula);
}
