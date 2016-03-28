package com.piushvaish;

/**
 * This class collects a pair of elements of different types
 * Created by piush on 28/03/2016.
 */
public class Pair<T , S> {
    private T first;
    private S second;

    /**
     * Construct a pair containing two given elements
     * @param firstElement
     * @param secondElement
     */
    public Pair(T firstElement,S secondElement){
        first = firstElement;
        second = secondElement;
    }

    /**
     * get the first element of the pair
     * @return
     */
    public T getFirst() {return first;}

    /**
     * get the second element of the pair
     * @return
     */
    public S getSecond(){return  second;}

    public String toString(){return  "( " + first + "," + second + ")";}
}
