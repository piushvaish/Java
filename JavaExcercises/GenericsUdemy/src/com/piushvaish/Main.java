package com.piushvaish;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckam = new SoccerPlayer("Beckam");
        Team <FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        //adelaideCrows.addPlayer(pat);
        //adelaideCrows.addPlayer(beckam);
        System.out.println(adelaideCrows.numPlyers());

       Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Cubs");
        baseballPlayerTeam.addPlayer(pat);
        Team<SoccerPlayer> brokenTeam = new Team<>("This won't work");
        brokenTeam.addPlayer(beckam);

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> dublin = new Team<>("Dublin");
        Team<FootballPlayer> cork = new Team<>("Cork");
        Team<FootballPlayer> kerry = new Team<>("Kerry");
        Team<FootballPlayer> galway = new Team<>("Galway");
        Team<BaseballPlayer> baseballPlayerTeam1 = new Team<>("Chicago cubs");
        dublin.matchResult(kerry,1,0);
        dublin.matchResult(galway,2,8);
        galway.matchResult(kerry,2,1);
        footballLeague.add(dublin);
        footballLeague.add(cork);
        footballLeague.add(kerry);
        footballLeague.add(galway);
       // footballLeague.add(baseballPlayerTeam1);
        footballLeague.showleagueTable();

    }
}
