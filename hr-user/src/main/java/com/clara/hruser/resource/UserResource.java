package com.clara.hruser.resource;

import com.clara.hruser.entity.User;
import com.clara.hruser.repository.UserRepository;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RefreshScope
@RequestMapping("/users")
public class UserResource {
    private final UserRepository repository;

    public UserResource(UserRepository repository) {
        this.repository = repository;
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User user = repository.findById(id).get();
        return ResponseEntity.ok(user);
    }
    @GetMapping(value = "/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email){
        User user = repository.findByEmail(email);
        return ResponseEntity.ok(user);
    }
}
