package com.stackroute.domain;

import com.stackroute.domain.Actor;

public class Movie
{
    private Actor actor;

    public void setActor(Actor actor)
    {
        this.actor = actor;
    }
    public void display()
    {
        System.out.println("The actor information : " +actor.getName()+"  "+actor.getGender() +"   "+actor.getAge());
    }
}