package com.quang.healthcare.controller;

import com.quang.healthcare.dto.request.CreateHealthProfileRequest;
import com.quang.healthcare.dto.response.HealthProfileResponse;
import com.quang.healthcare.model.HealthProfile;
import com.quang.healthcare.service.HealthProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/health-profiles")
public class HealthProfileController {
    @Autowired
    private HealthProfileService healthProfileService;

    @PostMapping
    public ResponseEntity<HealthProfileResponse> createHealthProfile(@RequestBody CreateHealthProfileRequest request) {
        HealthProfile healthProfile = new HealthProfile();
        healthProfile.setHeight(request.getHeight());
        healthProfile.setCurrentWeight(request.getCurrentWeight());

        HealthProfile createdHealthProfile = healthProfileService.createHealthProfile(healthProfile);

        HealthProfileResponse healthProfileResponse = new HealthProfileResponse();
        healthProfileResponse.setHeight(createdHealthProfile.getHeight());
        healthProfileResponse.setCurrentWeight(createdHealthProfile.getCurrentWeight());
        healthProfileResponse.setBmi(createdHealthProfile.getBmi());

        return ResponseEntity.ok(healthProfileResponse);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<HealthProfileResponse> getHealthProfileByUserId(@PathVariable Long userId) {
        HealthProfile healthProfile = healthProfileService.getHealthProfileByUserId(userId);

        HealthProfileResponse healthProfileResponse = new HealthProfileResponse();
        healthProfileResponse.setHeight(healthProfile.getHeight());
        healthProfileResponse.setCurrentWeight(healthProfile.getCurrentWeight());
        healthProfileResponse.setBmi(healthProfile.getBmi());

        return ResponseEntity.ok(healthProfileResponse);
    }
}