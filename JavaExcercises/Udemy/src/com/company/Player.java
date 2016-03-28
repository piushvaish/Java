package com.company;

/**
 * Created by piush on 24/01/2016.
 */
public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <=0){
            if(this.health <=0){
                System.out.println("Player knocked out");
                //Reduce number of lives remaining for the player
            }
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
