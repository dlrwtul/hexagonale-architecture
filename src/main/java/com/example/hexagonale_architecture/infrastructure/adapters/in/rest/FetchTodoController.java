package com.example.hexagonale_architecture.infrastructure.adapters.in.rest;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hexagonale_architecture.application.ports.in.FetchTodoUseCase;
import com.example.hexagonale_architecture.domain.models.Todo;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/todos")
public class FetchTodoController {

    private final FetchTodoUseCase useCase;

    @GetMapping()
    public ResponseEntity<List<Todo>> list() {
        return ResponseEntity.ok(useCase.fetchAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Todo> getOne(@PathVariable String id) {
        return ResponseEntity.ok(useCase.fetchById(id));
    }

    @GetMapping("mongo")
    public ResponseEntity<List<Todo>> listMongo() {
        return ResponseEntity.ok(useCase.fetchMongoAll());
    }

    @GetMapping("mongo/{id}")
    public ResponseEntity<Todo> getOneMongo(@PathVariable String id) {
        return ResponseEntity.ok(useCase.fetchMongoById(id));
    }

    @GetMapping("search")
    public ResponseEntity<Page<Todo>> search(
        @RequestParam(required = false) String title,
        @RequestParam(required = false) Boolean isDone

    ) {
        return ResponseEntity.ok(useCase.search(title,isDone));
    }
}
