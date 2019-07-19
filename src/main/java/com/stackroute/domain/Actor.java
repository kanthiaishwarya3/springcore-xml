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
    public Actor()
    {

    }
    //getting value of the name member
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

    //setting value in the name member
    public void setName(String name) {
        this.name = name;
    }

    //setting value in the gender member
    public void setGender(String gender) {
        this.gender = gender;
    }

    //setting value in the age member
    public void setAge(int age) {
        this.age = age;
    }
}
