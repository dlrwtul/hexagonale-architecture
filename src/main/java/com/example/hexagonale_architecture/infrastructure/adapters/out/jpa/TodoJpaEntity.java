package com.example.hexagonale_architecture.infrastructure.adapters.out.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity(name = "todos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column()
    private String title;

    @Column()
    private String description;

    @Column()
    private Boolean isDone;
}
