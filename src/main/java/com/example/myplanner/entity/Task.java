package com.example.myplanner.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {
    private Long id;
    private Long planId;
    private String content;
}
