package com.clara.hrworker.resources;

import com.clara.hrworker.entity.Worker;
import com.clara.hrworker.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workers")
@RefreshScope
public class WorkerResource {
    private final WorkerRepository repository;
    private final Environment env;
    @Value("${test.config}")
    private String configs;

    public WorkerResource(WorkerRepository repository, Environment env) {
        this.repository = repository;
        this.env = env;
    }
    @GetMapping
    public ResponseEntity<List<Worker>> getAll() {
        List<Worker> workers =  repository.findAll();
        return ResponseEntity.ok(workers);
    }
    @GetMapping(value = "/configs")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok(configs);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> getById(@PathVariable Long id) {
        try {
            Thread.sleep(1000L);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        Worker worker =  repository.findById(id).get();
        return ResponseEntity.ok(worker);
    }
}
