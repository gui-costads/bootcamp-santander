package com.apirest.bootcampsantander.domain.controller;

import com.apirest.bootcampsantander.domain.model.User;
import com.apirest.bootcampsantander.domain.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User user = userService.findById(id);
        return ResponseEntity.ok(user);
    }
    @PostMapping()
    public ResponseEntity<User> createUser(@RequestBody User userToCreate){
        User userCreated = userService.createUser(userToCreate);
        URI uri = ServletUriComponentsBuilder
                    .fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(userCreated.getId()).toUri();
        return ResponseEntity.created(uri).body(userCreated);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User userToUpdate, @PathVariable Long id){
        userService.updateUser(userToUpdate, id);
        return ResponseEntity.ok(userToUpdate);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id){
        userService.deleteById(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
