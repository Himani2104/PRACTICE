package com.example.Restful.Webservices.Part2.StaticFiltering;

import com.example.Restful.Webservices.Part2.StaticFiltering.UserService;


import com.example.Restful.Webservices.Part2.StaticFiltering.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;



    @GetMapping("/users")
    public List<User> findAllUsers()
    {
        return userService.getAllUser();
    }

   
    @GetMapping("/users/{id}")

    public User getUser(@PathVariable int id)
    {
        User user= userService.getUserById(id);


        return user;
    }

    @PostMapping("/users")

    public User createUser(@RequestBody User user)
    {
        return userService.addNewUser(user);
    }

    @DeleteMapping("/users/{id}")

    public void deleteUser(@PathVariable int id)
    {
        userService.removeUserById(id);
    }

    @PutMapping("/users/{id}")
    public User UpdateUser(@PathVariable int id,@RequestBody User user)
    {
        userService.updateUser(user,id);
        return user;
    }
}
