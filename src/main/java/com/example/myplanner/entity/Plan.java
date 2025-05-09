package com.example.myplanner.entity;


import com.example.myplanner.dto.PlanRequestDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Plan {
    private Long id;
    private String name;
    private String password;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private String title;
    private String content;

    public Plan(Long id, String name, String password, String title, String content){
        this.id = id;
        this.name = name;
        this.password = password;
        this.title = title;
        this.createAt = LocalDateTime.now();
        this.updateAt = LocalDateTime.now();
        this.content = content;
    }

    public void update(PlanRequestDto dto) {
        this.name = dto.getName();
        this.content = dto.getContent();
        this.updateAt = LocalDateTime.now();
    }
}
