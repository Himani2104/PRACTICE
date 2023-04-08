package com.example.Restful.Webservices.Part2.Versioning;

import org.springframework.stereotype.Component;

@Component
public class Userv1 {
    private int userId;
    private String name;

    Userv1()
    {

    }

    public Userv1(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
