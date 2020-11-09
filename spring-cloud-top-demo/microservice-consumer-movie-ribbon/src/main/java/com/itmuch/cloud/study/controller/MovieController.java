package com.itmuch.cloud.study.controller;

import com.itmuch.cloud.study.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: lanyong_csd
 * @Create: 2019/10/10 16:30
 * @Company: Si-tech
 * @Description:
 **/
@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/users/{id}")
    public User findByid(@PathVariable Long id){
        User user = restTemplate.getForObject("http://microservice-provider-user/users/{id}", User.class, id);
        return user;
    }
}
