package com.quang.healthcare.repository;


import com.quang.healthcare.model.HealthProfile;
import com.quang.healthcare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}

