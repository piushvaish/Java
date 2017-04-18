package com.piushvaish;

/**
 * Created by piush on 13/03/2017.
 */
public class Door {
    private String color;
    private String material;

    public Door(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public String getColor() {
        return color;
    }
    public void openDoor(){
        System.out.println("The door is open");
    }

    public String getMaterial() {
        return material;
    }
}
