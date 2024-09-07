package com.quang.healthcare.controller;

import com.quang.healthcare.dto.request.CreateUserRequest;
import com.quang.healthcare.dto.response.UserResponse;
import com.quang.healthcare.model.User;
import com.quang.healthcare.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserResponse> createUser(@RequestBody CreateUserRequest request) {
        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        User createdUser = userService.createUser(user);

        UserResponse userResponse = new UserResponse();
        userResponse.setId(createdUser.getId());
        userResponse.setEmail(createdUser.getEmail());
        userResponse.setName(createdUser.getName());

        return ResponseEntity.ok(userResponse);
    }

    @GetMapping("/{email}")
    public ResponseEntity<UserResponse> getUserByEmail(@PathVariable String email) {
        User user = userService.getUserByEmail(email);
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setEmail(user.getEmail());
        userResponse.setName(user.getName());

        return ResponseEntity.ok(userResponse);
    }
}