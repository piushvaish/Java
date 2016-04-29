package com.piushvaish;

/**
 * Created by piush on 24/04/2016.
 */
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
