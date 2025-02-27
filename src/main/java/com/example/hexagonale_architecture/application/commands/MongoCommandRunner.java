package com.example.hexagonale_architecture.application.commands;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.hexagonale_architecture.application.ports.out.TodoPersistencePort;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
@RequiredArgsConstructor
public class MongoCommandRunner implements CommandLineRunner {

    private final TodoPersistencePort mongoPort;

    @Override
    public void run(String... args) throws Exception {
        mongoPort.save("Test 1", "Desc Test 1");
        mongoPort.save("Test 2", "Desc Test 2");
        mongoPort.save("Test 3", "Desc Test 3");

        log.info("Mongo command done");
    }

}
