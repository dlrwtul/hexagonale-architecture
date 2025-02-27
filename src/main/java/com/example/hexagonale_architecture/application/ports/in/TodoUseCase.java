package com.example.hexagonale_architecture.application.ports.in;

import com.example.hexagonale_architecture.domain.models.Todo;

public interface TodoUseCase {
    Todo create(String title, String description);

    Todo update(String id, String title, String description);

    Todo updateIsDone(String id, Boolean isDone);

    void delete(String id);
}
