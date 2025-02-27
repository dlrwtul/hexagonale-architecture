package com.example.hexagonale_architecture.infrastructure.adapters.out.jpa;

import java.util.List;

import org.hibernate.validator.constraints.CodePointLength;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.example.hexagonale_architecture.application.ports.out.TodoPersistencePort;
import com.example.hexagonale_architecture.domain.models.Todo;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
@RequiredArgsConstructor
public class TodoJpaPersitenceAdapter implements TodoPersistencePort {

    private final TodoJpaRepository repository;
    private final TodoJpaMapper mapper;

    @Override
    public List<Todo> findAll() {
        return mapper.mapListToDomain(repository.findAll());
    }

    @Override
    public Page<Todo> filter(String title, Boolean isDone) {
        throw new UnsupportedOperationException("Unimplemented method 'filter'");
    }

    @Override
    public Todo findById(String id) {
        return mapper.mapToDomain(repository.findById(Long.parseLong(id)).orElseThrow(EntityNotFoundException::new));
    }

    @Override
    public Todo save(String title, String description) {
        return mapper
                .mapToDomain(repository.save(
                        TodoJpaEntity.builder()
                                .title(title)
                                .description(description)
                                .isDone(false)
                                .build()));
    }

    @Override
    public Todo update(String id, String title, String description) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Todo updateIsDone(String id, Boolean isDone) {
        throw new UnsupportedOperationException("Unimplemented method 'updateIsDone'");
    }

    @Override
    public Todo remove(String id) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

}
