package com.example.hexagonale_architecture.domain.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandle {

    @ExceptionHandler(ModelNotFoundExeption.class)
    public ResponseEntity<Object> handleModelNotFoundException(ModelNotFoundExeption exeption) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(exeption.getMessage());
    }
}
