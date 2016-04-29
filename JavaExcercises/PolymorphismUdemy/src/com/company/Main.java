package com.company;

public class Main {
    public static void main(String[] args){
        Porsche porsche = new Porsche("Porsche",4);

        System.out.println(porsche.getName() + porsche.startEngine());


        /*for(int i = 0; i <1; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                    ":" + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }*/
    }
    /*public static Movie randomMovie(){
        int randomNum = (int)(Math.random() * 5 ) + 1;
        System.out.println("Random number generate was :" + randomNum);
        switch(randomNum){
            case 1:
                return new Jaws();
            case 2 :
                return new Indepence();
            case 3:
                return new Mazeruner();
            case 4:
                return new Starwars();
            case 5:
                return new Forgetable();
        }
        return null;
    }*/
}


/*class Movie {


    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "No plot here";

    }
}
class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "A shark eats lots of people";
    }
}
class Indepence extends Movie{
    public Indepence(){
        super("Independence");
    }
    public String plot(){
        return "Aliens attempt to take over the earth";
    }
}
class Mazeruner extends Movie{
    public Mazeruner(){
        super("Mazerunner");
    }
    public String plot(){
        return "Kids try to escape a maze";
    }
}
class Starwars extends Movie{
    public Starwars(){
        super("Starwars");
    }
    public String plot(){
        return "Imperial forces try to take over universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }
}*/





