package com.quang.healthcare.dto.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateHealthProfileRequest {
    private Long userId;
    private Float height;
    private Float currentWeight;

}