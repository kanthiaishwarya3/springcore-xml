package com.stackroute.domain;

public class Actor
{
    // Declaration
    private String name,gender;
    private int age;

    public Actor(String name, String gender, int age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public String getGender()
    {
        return gender;
    }

    public int getAge()
    {
        return age;
    }
}
