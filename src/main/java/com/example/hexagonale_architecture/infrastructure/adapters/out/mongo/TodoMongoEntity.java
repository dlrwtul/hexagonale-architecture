package com.example.hexagonale_architecture.infrastructure.adapters.out.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("Todos")
public class TodoMongoEntity {

    @Id
    private String id;

    private String title;

    private String description;

    private Boolean isDone;
}
