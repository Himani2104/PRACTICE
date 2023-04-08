package com.example.Restful.Webservices.Part2.Versioning;

import org.springframework.stereotype.Component;

@Component
public class Userv2 {
    private Name name;
    private int userId;




    private int age;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Userv2(Name name, int userId, int age) {
        this.name=name;
        this.userId = userId;
        this.age = age;

    }

    Userv2()
    {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }








}