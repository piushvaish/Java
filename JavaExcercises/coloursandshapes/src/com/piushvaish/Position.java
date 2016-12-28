package com.piushvaish;

/**
 * Created by piush on 14/10/2016.
 */
public class Position {
    public int left;
    public int top;

    public Position(int left,int top){
        this.left = left;
        this.top = top;
    }
    public Position(){
        this(0,0);
    }

    @Override
    public String toString(){
        return String.format("Position(%d,%d",left,top);
    }

}
