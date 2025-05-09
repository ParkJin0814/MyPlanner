package com.example.myplanner.dto;

import com.example.myplanner.entity.Plan;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class PlanResponseDto {
    private Long id;
    private Long userId;
    private LocalDate createAt;
    private LocalDate updateAt;
    private String title;

    public PlanResponseDto(Plan plan){
        this.id = plan.getId();
        this.userId = plan.getUserId();
        this.title = plan.getTitle();
        this.createAt = plan.getCreateAt();
        this.updateAt = plan.getCreateAt();
    }
}
