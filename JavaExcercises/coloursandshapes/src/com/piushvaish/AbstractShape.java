package com.piushvaish;

/**
 * Created by piush on 14/10/2016.
 */
public abstract class AbstractShape {
    public abstract void draw();

    public abstract int getArea();

    protected Position position = new Position(0,0);
    protected int width = 0;
    protected int height = 0;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
