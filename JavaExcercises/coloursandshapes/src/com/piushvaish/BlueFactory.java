package com.piushvaish;

/**
 * Created by piush on 15/10/2016.
 */
public class BlueFactory extends AbstractShapeFactory {

    @Override
    public BlueCircle createCircle(){
        return new BlueCircle();

    }
    @Override
    public BlueRectangle createRectangle(){
        return new BlueRectangle();

    }
    @Override
    public BlueTriangle createTriangle(){
        return new BlueTriangle();

    }
}
