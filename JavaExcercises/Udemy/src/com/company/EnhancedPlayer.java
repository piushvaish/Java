package com.company;

/**
 * Created by piush on 24/01/2016.
 */
public class EnhancedPlayer {
    private String name;
    private int hitpoint =100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health >0 && health <= 100) {
            this.hitpoint = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitpoint = this.hitpoint - damage;
        if(this.hitpoint <=0){
            if(this.hitpoint <=0){
                System.out.println("Player knocked out");
                //Reduce number of lives remaining for the player
            }
        }
    }
    public int getHealth(){
        return this.hitpoint;
    }
}
