package com.shs.beapi.controller;

import com.shs.beapi.dto.UserDto;
import com.shs.beapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public void save(@RequestBody UserDto userDto) {
        userService.saveUser(userDto);
    }
}
