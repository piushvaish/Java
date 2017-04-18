package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by piush on 14/04/2017.
 */
public class Players implements IStorageMedium {

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;


    public Players(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public void read(List<String> saveValues) {

        if((saveValues != null) && (saveValues.size() > 0)){
            this.name = saveValues.get(0);
            this.hitPoints = Integer.parseInt(saveValues.get(1));
            this.strength = Integer.parseInt(saveValues.get(2));
            this.weapon = saveValues.get(3);
        }


    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0,this.name);
        values.add(1,"" + this.hitPoints);
        values.add(2,"" + this.strength);
        values.add(3,this.weapon);


        return values;
    }
}
