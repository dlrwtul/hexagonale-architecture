package com.example.hexagonale_architecture.infrastructure.adapters.in.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTodo {
    @NotBlank(message = "Title required")
    private String title;
    private String description;
}
