package com.example.hexagonale_architecture.infrastructure.adapters.out.jpa;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hexagonale_architecture.domain.models.Todo;

@Service
public class TodoJpaMapper {

    Todo mapToDomain(TodoJpaEntity e) {
        return Todo.builder()
                .title(e.getTitle())
                .description(e.getDescription())
                .isDone(e.getIsDone())
                .build();
    }

    TodoJpaEntity mapToEntity(Todo d) {
        return TodoJpaEntity.builder()
                .title(d.getTitle())
                .description(d.getDescription())
                .isDone(d.getIsDone())
                .build();
    }

    List<Todo> mapListToDomain(List<TodoJpaEntity> list) {
        return list.stream().map(e -> Todo.builder()
                .title(e.getTitle())
                .description(e.getDescription())
                .isDone(e.getIsDone())
                .build()).toList();
    }

}
