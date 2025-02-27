package com.example.hexagonale_architecture.application.ports.out;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.example.hexagonale_architecture.domain.models.Todo;

@Service
public interface TodoPersistencePort {
    List<Todo> findAll();

    Page<Todo> filter(String title, Boolean isDone);

    Todo findById(String id);

    Todo save(String title, String description);

    Todo update(String id, String title, String description);

    Todo updateIsDone(String id, Boolean isDone);

    Todo remove(String id);
}
