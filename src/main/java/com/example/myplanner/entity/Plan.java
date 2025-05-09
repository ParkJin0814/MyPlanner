package com.example.myplanner.entity;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Plan {
    private Long id;
    private Long userId;
    private LocalDate createAt;
    private LocalDate updateAt;
    private String title;
    private List<Task> tasks;

    public Plan(Long id, Long userId, String title){
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.createAt = LocalDate.now();
        this.updateAt = LocalDate.now();
        tasks = new ArrayList<>();
    }
}
