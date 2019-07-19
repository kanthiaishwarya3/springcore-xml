package com.stackroute.domain;

import com.stackroute.domain.Actor;

public class Movie
{
    /*creating object for actor class*/
    private Actor actor;

    public Movie(Actor actor)
    {
        this.actor = actor;
    }
//to display actor information
    public void display()
    {
        System.out.println("The actor information : " +actor.getName()+"  "+actor.getGender() +"   "+actor.getAge());
    }
}
