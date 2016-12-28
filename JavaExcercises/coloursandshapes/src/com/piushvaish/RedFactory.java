package com.piushvaish;

/**
 * Created by piush on 15/10/2016.
 */
public class RedFactory extends AbstractShapeFactory {

    @Override
    public RedCircle createCircle(){
        return new RedCircle();

    }
    @Override
    public RedRectangle createRectangle(){
        return new RedRectangle();

    }
    @Override
    public RedTriangle createTriangle(){
        return new RedTriangle();

    }
}
