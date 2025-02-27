package com.example.hexagonale_architecture.application.ports.in;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.hexagonale_architecture.domain.models.Todo;

public interface FetchTodoUseCase {
    List<Todo> fetchAll();

    List<Todo> fetchMongoAll();

    Page<Todo> search(String title, Boolean isDone);

    Todo fetchById(String id);

    Todo fetchMongoById(String id);

}
