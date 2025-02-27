package com.example.hexagonale_architecture.infrastructure.adapters.out.mongo;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hexagonale_architecture.domain.models.Todo;

@Service
public class TodoMongoMapper {

    Todo mapToDomain(TodoMongoEntity e) {
        return Todo.builder()
                .title(e.getTitle())
                .description(e.getDescription())
                .isDone(e.getIsDone())
                .build();
    }

    TodoMongoEntity mapToEntity(Todo d) {
        return TodoMongoEntity.builder()
                .title(d.getTitle())
                .description(d.getDescription())
                .isDone(d.getIsDone())
                .build();
    }

    List<Todo> mapListToDomain(List<TodoMongoEntity> list) {
        return list.stream().map(e -> Todo.builder()
                .title(e.getTitle())
                .description(e.getDescription())
                .isDone(e.getIsDone())
                .build()).toList();
    }

}
