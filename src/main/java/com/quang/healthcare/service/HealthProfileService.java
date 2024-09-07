package com.quang.healthcare.service;

import com.quang.healthcare.model.HealthProfile;
import com.quang.healthcare.repository.HealthProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthProfileService {
    @Autowired
    private HealthProfileRepository healthProfileRepository;

    public HealthProfile createHealthProfile(HealthProfile healthProfile) {
        // Add business logic (e.g., BMI calculation) here
        return healthProfileRepository.save(healthProfile);
    }

    public HealthProfile getHealthProfileByUserId(Long userId) {
        return healthProfileRepository.findByUserId(userId);
    }
}