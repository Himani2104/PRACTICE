package com.example.Restful.WebServices.Part1.Welcome;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeSpringController {
    @RequestMapping("/hello")
    public String welcome()
    {
        return "Hello Spring Boot";
    }
}
