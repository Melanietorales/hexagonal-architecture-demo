package com.example.project.domain.model;

import lombok.Data;

@Data
public class Task {
    private Integer id;
    private String description;
    private String status;
}
