package com.example.myplanner.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PlanRequestDto {
    private String name;
    private String password;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private String title;
    private String content;
}
