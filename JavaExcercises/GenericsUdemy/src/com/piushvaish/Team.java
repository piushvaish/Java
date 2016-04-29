package com.piushvaish;

import java.util.ArrayList;

/**
 * Created by piush on 24/04/2016.
 */

// notice typing in the diamond. it is to set the bounded type parameter
    // you can also have multiple bound with interfaces &
public class Team <T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean addPlayer(T player){
        if(members.contains(player)){
            // you need double brackets to fix up the code.
            // notice the casting with the Player class . Not required once T extends from Player
            //System.out.println(((Player)player).getName() + " is already on the team");
            System.out.println(player.getName() + " is already on the team");

            return false;
        }else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }

    }

    public int numPlyers(){
        return this.members.size();
    }
    public void matchResult( Team<T> opponent, int ourScore, int theirScore){
        if(ourScore > theirScore){
            won++;
        }else if(ourScore == theirScore){
            tied++;
        }else {
            lost++;
        }
        played++;
        if(opponent !=null){
            opponent.matchResult(null,theirScore,ourScore);
        }
    }
    public int ranking(){
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;

        }
    }

}

