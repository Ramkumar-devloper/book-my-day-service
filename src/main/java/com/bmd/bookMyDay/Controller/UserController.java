package com.bmd.bookMyDay.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmd.bookMyDay.Dto.User;
import com.bmd.bookMyDay.Service.UserService;

@RestController
@RequestMapping("/auth")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/sign")
    public User createUser(@RequestBody User user){
        System.out.println("User data: " + user.toString());
        return userService.createUser(user);
    }
}
