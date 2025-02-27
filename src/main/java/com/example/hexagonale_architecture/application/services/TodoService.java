package com.example.hexagonale_architecture.application.services;

import org.springframework.stereotype.Service;

import com.example.hexagonale_architecture.application.ports.in.TodoUseCase;
import com.example.hexagonale_architecture.application.ports.out.TodoPersistencePort;
import com.example.hexagonale_architecture.domain.models.Todo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoService implements TodoUseCase {

    private final TodoPersistencePort port;
    
    @Override
    public Todo create(String title, String description) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public Todo update(String id, String title, String description) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Todo updateIsDone(String id, Boolean isDone) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateIsDone'");
    }

    @Override
    public void delete(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
