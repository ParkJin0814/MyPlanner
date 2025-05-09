package com.example.myplanner.dto;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class PlanRequestDto {
    private Long userId;
    private LocalDate createAt;
    private LocalDate updateAt;
    private String title;
}
