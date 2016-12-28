package com.piushvaish;

/**
 * Created by piush on 15/10/2016.
 */
public class Triangle extends AbstractShape{

    public Triangle() {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(){
        System.out.printf("Triangle at %s, width: %d, height: %d\n",this.position.toString(),this.width,this.height);
    }

    @Override
    //Area = (width*height)/2
    public int getArea(){
        return (width * height)/2;

    }
}
