package com.example.hexagonale_architecture.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Todo {
    private String id;
    private String title;
    private String description;
    private Boolean isDone;
}
