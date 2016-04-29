package com.piushvaish;

/**
 * Created by piush on 24/04/2016.
 */
public class Penguin extends Bird {
    public Penguin(String name) {

        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I am not very good at it, I can go for a swim instead");
    }
}
