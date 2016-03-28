package com.company;

/**
 * Created by piush on 27/02/2016.
 */
public class StringMeasurer implements Measurable {
    public double measure(Object obj){
        String str = (String) obj;
        return str.length();
    }
}
