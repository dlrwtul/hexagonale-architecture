package com.example.hexagonale_architecture.domain.exceptions;

public class ModelNotFoundExeption extends RuntimeException {
    public ModelNotFoundExeption(String message){
        super(message);
    }
}
