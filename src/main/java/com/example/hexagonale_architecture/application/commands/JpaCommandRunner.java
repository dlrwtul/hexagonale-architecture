package com.example.hexagonale_architecture.application.commands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.hexagonale_architecture.application.ports.out.TodoPersistencePort;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class JpaCommandRunner implements CommandLineRunner {

    @Autowired
    @Qualifier("todoJpaPersistenceAdapter")
    private TodoPersistencePort port;

    @Autowired
    @Qualifier("todoMongoPersistenceAdapter")
    private TodoPersistencePort mongoPort;

    @Override
    public void run(String... args) throws Exception {
        port.save("Test 1", "Desc Test 1");
        port.save("Test 2", "Desc Test 2");
        port.save("Test 3", "Desc Test 3");

        log.info("Jpa command done");
    }
    
}
