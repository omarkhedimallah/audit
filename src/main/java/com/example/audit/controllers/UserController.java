package com.example.audit.controllers;

import com.example.audit.Services.UserService;
import com.example.audit.models.Userr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Userr")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity <List<Userr>> getAllUsers() {
        List<Userr> userr = userService.getAllUsers();
        return ResponseEntity.ok(userr);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Userr> getUserById(@PathVariable Long id) {
        Userr userr = userService.getUserById(id);
        if (userr== null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userr);
    }

    @PostMapping
    public ResponseEntity<Userr> createUser(@RequestBody Userr userr) {
        Userr savedUser = userService.saveUser(userr);
        return ResponseEntity.ok(savedUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}


