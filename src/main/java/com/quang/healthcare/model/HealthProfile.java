package com.quang.healthcare.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "HealthProfiles")
@Getter
@Setter
public class HealthProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "height")
    private Float height;

    @Column(name = "current_weight")
    private Float currentWeight;

    @Column(name = "bmi")
    private Float bmi;

}