package com.company;

/**
 * Created by piush on 17/04/2017.
 */
public abstract class Team {

    private String teamName;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }
}
