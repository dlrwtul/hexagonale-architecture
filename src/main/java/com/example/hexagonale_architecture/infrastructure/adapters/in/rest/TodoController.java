package com.example.hexagonale_architecture.infrastructure.adapters.in.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hexagonale_architecture.application.ports.in.TodoUseCase;
import com.example.hexagonale_architecture.domain.models.Todo;
import com.example.hexagonale_architecture.infrastructure.adapters.in.dto.CreateTodo;
import com.example.hexagonale_architecture.infrastructure.adapters.in.dto.UpdateTodo;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/todos")
public class TodoController {

    private final TodoUseCase useCase;

    @PostMapping()
    public ResponseEntity<Todo> create(@RequestBody CreateTodo body) {
        return new ResponseEntity<Todo>(
                useCase.create(body.getTitle(), body.getDescription()),
                HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<Todo> update(@PathVariable String id, @RequestBody UpdateTodo body) {
        return new ResponseEntity<Todo>(
                useCase.update(id, body.getTitle(), body.getDescription()),
                HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
        useCase.delete(id);
        return new ResponseEntity<>(
                "deleted",
                HttpStatus.ACCEPTED);
    }

}
