package com.example.hexagonale_architecture.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.example.hexagonale_architecture.application.ports.in.FetchTodoUseCase;
import com.example.hexagonale_architecture.application.ports.out.TodoPersistencePort;
import com.example.hexagonale_architecture.domain.models.Todo;

@Service
public class FetchTodoService implements FetchTodoUseCase {

    @Autowired
    @Qualifier("todoJpaPersistenceAdapter")
    private TodoPersistencePort port;

    @Autowired
    @Qualifier("todoMongoPersistenceAdapter")
    private TodoPersistencePort mongoPort;

    @Override
    public List<Todo> fetchAll() {
        return port.findAll();
    }

    @Override
    public List<Todo> fetchMongoAll() {
        return mongoPort.findAll();
    }

    @Override
    public Page<Todo> search(String title, Boolean isDone) {
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

    @Override
    public Todo fetchById(String id) {
        return port.findById(id);
    }

    @Override
    public Todo fetchMongoById(String id) {
        return mongoPort.findById(id);
    }
    
}
