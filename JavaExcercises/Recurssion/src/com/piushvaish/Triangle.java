package com.piushvaish;

/**
 * Created by piush on 07/03/2016.
 */
public class Triangle {
    private int width;
    public Triangle(int aWidth){
        width = aWidth;
    }
    public int getArea(){
        if(width <= 0){
            return 0;
        } else if( width == 1){return 1;}
        else {
          Triangle smallerTriangle = new Triangle(width -1);
          int smallerArea = smallerTriangle.getArea();
          return smallerArea + width;
      }

    }
    public int pow2(int n){
        if(n == 1){ return 2;}
        else{
            return 2 * pow2(n-1);
        }

    }
    public int mystery(int n){
        if(n <= 0){ return 0;}
        else {
            int smaller = n - 1;
            return mystery(smaller) + n * n;

        }
    }
}
