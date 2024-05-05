package com.asiastar.bookleaf.controller;


import com.asiastar.bookleaf.dto.request.UserRequest;
import com.asiastar.bookleaf.dto.response.UserResponse;
import com.asiastar.bookleaf.service.user.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController( UserService userService) {
        this.userService = userService;

    }
@PostMapping
    public ResponseEntity<UserResponse> save(@RequestBody @Valid UserRequest userRequest){
       return ResponseEntity.ok(userService.save(userRequest));
}


}
