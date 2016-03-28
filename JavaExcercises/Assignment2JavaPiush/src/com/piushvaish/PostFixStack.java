package com.piushvaish;

import java.util.ArrayList;

/**
 * Created by piush on 11/03/2016.
 */

public class PostFixStack {
    // variable
    private ArrayList<String> stringArray = new ArrayList<String>();
    int i = stringArray.size();
     /**
     * Add an element to the stack
     */
    public void push(String newElement){
        stringArray.add(newElement);
    }
    /**
     * Remove the most recent pushed element
     */
    public String pop(){
        if(i > 0){
            return stringArray.get(i - 1);
        } else
            return null;

    }
    /**
     * Look for a value but do not remove the most recently pushed element
     * @return
     */
    public String peek(){
        if(i > 0){
            return stringArray.get(i);
        } else
            return null;


    }

    /**
     * Check if there are any items on the stack
     * @return
     */
    public boolean isEmpty(){
        return i == 0;
    }





}
