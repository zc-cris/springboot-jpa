package com.cris.springboot.controller;

import com.cris.springboot.entity.User;
import com.cris.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author zc-cris
 * @Version 1.0
 **/
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        User user = userRepository.findOne(id);     //findOne而不是getOne
        return user;
    }

    @GetMapping("/user")
    public User saveUser(User user){
        User one = userRepository.save(user);
        System.out.println(one);
        return one;
    }

}
