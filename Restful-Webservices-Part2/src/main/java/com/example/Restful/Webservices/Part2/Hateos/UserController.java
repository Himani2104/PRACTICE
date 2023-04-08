package com.example.Restful.Webservices.Part2.Hateos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
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

    public EntityModel<User> getUser(@PathVariable int id)
    {
        User user= userService.getUserById(id);

        EntityModel<User> entityModel=EntityModel.of(user);
        WebMvcLinkBuilder link=WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).findAllUsers());
        entityModel.add(link.withRel("all-users"));


        return entityModel;
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
