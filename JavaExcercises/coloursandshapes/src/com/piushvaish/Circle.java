package com.piushvaish;

/**
 * Created by piush on 15/10/2016.
 */
public class Circle extends AbstractShape {
    private int radius;

    //convert double pi into an int as abstract method returns an int
    double pi = Math.PI;
    int piInt = (int) pi;

    public Circle() {
        this.radius = radius;
    }

    @Override
    public void draw(){
        System.out.printf("Circle at %s, radius: %d\n",this.position.toString(),this.radius);
    }

    @Override
    // Area = π r^2
    public int getArea(){
        return piInt * (radius * radius);

    }
}
