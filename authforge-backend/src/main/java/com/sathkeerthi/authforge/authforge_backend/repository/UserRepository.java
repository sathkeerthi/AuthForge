package com.sathkeerthi.authforge.authforge_backend.repository;

import com.sathkeerthi.authforge.authforge_backend.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);
}
