package com.piushvaish;

/**
 * Created by piush on 09/09/2016.
 */
public class Moon extends HeavenlyBody {
    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }
}
