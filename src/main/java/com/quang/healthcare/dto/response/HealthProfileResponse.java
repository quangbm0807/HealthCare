package com.quang.healthcare.dto.response;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HealthProfileResponse {
    private Long userId;
    private Float height;
    private Float currentWeight;
    private Float bmi;
}