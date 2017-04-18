package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by piush on 14/04/2017.
 */
public class Monster implements IStorageMedium {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public void read(List<String> saveValues) {
        if((saveValues != null) && (saveValues.size() > 0)){
            this.name = saveValues.get(0);
            this.hitPoints = Integer.parseInt(saveValues.get(1));
            this.strength = Integer.parseInt(saveValues.get(2));
                    }

    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0,this.name);
        values.add(1,"" + this.hitPoints);
        values.add(2,"" + this.strength);
        return values;
    }
}
