package com.example.hexagonale_architecture.infrastructure.adapters.out.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoMongoRepository extends MongoRepository<TodoMongoEntity , String> {
    
}
