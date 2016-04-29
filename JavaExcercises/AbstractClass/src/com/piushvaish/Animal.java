package com.piushvaish;

/**
 * Created by piush on 24/04/2016.
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
