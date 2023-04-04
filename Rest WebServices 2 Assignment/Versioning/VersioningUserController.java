package com.example.Restful.Webservices.Part2.Versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningUserController {
     @GetMapping("/v1/user")
    public Userv1 getFirstVersionOfUser()
    {
        return new Userv1(2345,"Himani Bhardwaj");
    }

    @GetMapping("v2/user")
    public Userv2 getSecondVersionofUser()
    {
        return new Userv2(new Name("Himani","Bhardwaj"),4567,21);
    }

     @GetMapping(value = "/user",params = "version=1")
    public Userv1 getFirstVersionOfUserUsingRequestParameters()
    {
        return new Userv1(2345,"Himani Bhardwaj");
    }

    @GetMapping(value = "/user",params = "version=2")
    public Userv2 getSecondVersionOfUserUsingRequestParameters()
    {
        return new Userv2(new Name("Himani","Bhardwaj"),4567,21);
    }

    @GetMapping(value = "/user/header",headers = "X-API-VERSION=1")
    public Userv1 getFirstVersionOfUserUsingRequestHeader()
    {
        return new Userv1(2345,"Himani Bhardwaj");
    }

    @GetMapping(value = "/user/header",headers = "X-API-VERSION=2")
    public Userv2 getSecondVersionOfUserUsingRequestHeader()
    {
        return new Userv2(new Name("Himani","Bhardwaj"),4567,21);
    }


    @GetMapping(value = "/user/accept",produces ="application/user.app-v1+json" )

    public Userv1 getFirstVersionOfUserUsingAcceptHeader()
    {
        return new Userv1(2345,"Himani Bhardwaj");
    }


    @GetMapping(value = "/user/accept",produces = "application/user.app-v2+json")
    public Userv2 getSecondVersionOfUserUsingAcceptHeader()
    {
        return new Userv2(new Name("Himani","Bhardwaj"),4567,21);
    }

}
