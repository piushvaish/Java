package com.piushvaish;

/**
 * Created by piush on 14/10/2016.
 */
public class Rectangle extends AbstractShape {

    public Rectangle() {
        this.width = width;
        this.height = height;
    }



    @Override
    public void draw(){
        System.out.printf("Rectangle at %s, width: %d, height: %d\n",this.position.toString(),this.width,this.height);
    }

    @Override
    public int getArea(){
        return width * height;

    }

}
