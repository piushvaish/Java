package com.piushvaish;

/**
 * Created by piush on 09/09/2016.
 */
public class Planet extends HeavenlyBody {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(moon.getKey().getBodyTypes() == BodyTypes.MOON){
            return super.addSatellite(moon);
        }else {
            return false;
        }
    }
}
