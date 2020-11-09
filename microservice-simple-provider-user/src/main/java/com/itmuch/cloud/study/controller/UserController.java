package com.itmuch.cloud.study.controller;

import com.itmuch.cloud.study.entity.User;
import com.itmuch.cloud.study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @Author: lanyong_csd
 * @Create: 2019/10/8 21:45
 * @Company: Si-tech
 * @Description:
 **/
@RequestMapping("/users")
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id){
        return this.userRepository.findById(id);
    }

}
