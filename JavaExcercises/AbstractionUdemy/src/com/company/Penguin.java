package com.company;

/**
 * Created by piush on 15/04/2017.
 */
public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println(getName() + " is not good at it.I can walk only");
    }
}


