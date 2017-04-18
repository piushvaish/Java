package com.company;

/**
 * Created by piush on 17/04/2017.
 */
public abstract class Player {
    private String name;

    public Player(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
