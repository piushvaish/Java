package com.company;

import java.util.ArrayList;

/**
 * Created by piush on 17/04/2017.
 */
public class League<T extends Team> implements Comparable<League<T>> {


    private String name;

    private ArrayList<T> league  = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(League<T> team) {
        return 0;
    }
}
