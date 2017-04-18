package com.piushvaish;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String plot(){
        return "No plot here";
    }
}
class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "Shark eat lots of people";
    }
}
class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("independence Day");
    }

    @Override
    public String plot() {
        return "Alien atempt to take over the world";
    }
}

class MazeRuner extends Movie{
    public MazeRuner(){
        super("MazeRuner");
    }

    @Override
    public String plot() {
        return "kids try to escape a maze";
    }
}
class ForgetfulMovie extends Movie{
    public ForgetfulMovie(){
        super("ForgetfulMovie");
    }
    //no plot for the movie
}

public class Main {

    public static void main(String[] args) {
        for (int i = 1;i < 11;i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                            ": " + movie.getName() + "\n" +
                            "plot: " + movie.plot() + "\n");
        }
    }

public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 4) + 1;
    System.out.println("Random number generated was: " + randomNumber);

    switch (randomNumber){
        case 1:
            return new Jaws();
        case 2:
            return new IndependenceDay();
        case 3:
            return new MazeRuner();
        case 4:
            return new ForgetfulMovie();
    }
    return null;
}

}
