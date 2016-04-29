package com.example.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by piush on 23/04/2016.
 */
public class Monster implements Isaveable {
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

    /*
    In fact, if you are creating value class or domain class e.g. Order, Trade or Employee,  always override equals,hashCode, compareTo and toString method in Java.  By default toString implementation produces output in the form package.class@hashCode e.g. for our toString() example, Country class’ toString() method will print test.Country@18e2b22 where 18e2b22 is hashCode of an object in hex format, if you call hashCode method it will return 26094370, which is decimal equivalent of 18e2b22. This information is not very useful while troubleshooting any problem.

    Read more: http://javarevisited.blogspot.com/2012/09/override-tostring-method-java-tips-example-code.html#ixzz46gtoEFCa
    */
    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));

        }
    }
}
