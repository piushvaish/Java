package com.piushvaish;

/**
 * Created by piush on 14/10/2016.
 */
public class Builder {

    AbstractShapeFactory factory;

    //builder constructor

    public Builder(AbstractShapeFactory factory){
        this.factory = factory;
    }


    //build method
    public AbstractShape build( ){
        AbstractShape rectangle = factory.createRectangle();
        int a = rectangle.getHeight();
        int b = rectangle.getWidth();
        int area = a*b;
        System.out.println("The area is : " + area + "at the position " + rectangle.getPosition());
        return rectangle;

    }

    private void draw(AbstractShape shape, Position position){
        this.shape = shape;
        this.position = position;

    }

}
