package com.stackroute.domain;

public class Actor
{
    // data members of the class.
    private String name,gender;
    private int age;
    // constructor would initialize data members
    // with the values of passed arguments while
    // object of that class created.
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
