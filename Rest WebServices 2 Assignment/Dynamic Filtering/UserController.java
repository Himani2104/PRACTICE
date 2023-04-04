package com.example.Restful.Webservices.Part2.UserController;

import com.example.Restful.Webservices.Part2.Service.UserService;


import com.example.Restful.Webservices.Part2.Swagger.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
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

    public MappingJacksonValue createUser(@RequestBody User user)
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
