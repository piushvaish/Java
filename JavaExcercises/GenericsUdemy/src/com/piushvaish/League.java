package com.piushvaish;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by piush on 24/04/2016.
 */
public class League< T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }
    public boolean add(T team){
        if(league.contains(team)) {
            return false;
        }
        league.add(team);
        return true;
    }
    public  void showleagueTable(){
        Collections.sort(league);
        for(T t : league){
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
