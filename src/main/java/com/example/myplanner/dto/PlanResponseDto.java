package com.example.myplanner.dto;

import com.example.myplanner.entity.Plan;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PlanResponseDto {
    private Long id;
    private String name;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private String title;
    private String content;

    public PlanResponseDto(Plan plan){
        this.id = plan.getId();
        this.name = plan.getName();
        this.title = plan.getTitle();
        this.createAt = plan.getCreateAt();
        this.updateAt = plan.getCreateAt();
        this.content = plan.getContent();
    }
}
