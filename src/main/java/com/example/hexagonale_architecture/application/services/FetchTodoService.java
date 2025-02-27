package com.example.hexagonale_architecture.application.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.example.hexagonale_architecture.application.ports.in.FetchTodoUseCase;
import com.example.hexagonale_architecture.application.ports.out.TodoPersistencePort;
import com.example.hexagonale_architecture.domain.models.Todo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FetchTodoService implements FetchTodoUseCase {

    private final TodoPersistencePort port;

    @Override
    public List<Todo> fetchAll() {
        return port.findAll();
    }

    @Override
    public Page<Todo> search(String title, Boolean isDone) {
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

    @Override
    public Todo fetchById(String id) {
        return port.findById(id);
    }
    
}
