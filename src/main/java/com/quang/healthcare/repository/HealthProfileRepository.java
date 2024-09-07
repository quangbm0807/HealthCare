package com.quang.healthcare.repository;

import com.quang.healthcare.model.HealthProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthProfileRepository extends JpaRepository<HealthProfile, Long> {
    HealthProfile findByUserId(Long userId);
}