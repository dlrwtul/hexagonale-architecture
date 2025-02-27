package com.example.hexagonale_architecture.infrastructure.adapters.out.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoJpaRepository extends JpaRepository<TodoJpaEntity , Long> {
    
}
