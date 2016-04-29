
package com.company;

import java.util.ArrayList;

/**
 * Created by piush on 17/03/2016.
 */
public class PostFixStack {
    private ArrayList<String> myStack = new ArrayList();

    /**
     * Add an element to the stack
     * @param newElement is a string
     */
    public void push(String newElement) {
        myStack.add(newElement);
    }

    /**
     * Check if there are any items on the stack
     * @return True if the stack is empty
     */

    public boolean isEmpty() {
        return myStack.isEmpty();
    }


    /**
     * Remove the most recently pushed element
     * @return the last element in a list
     */
    public String pop() {
        String last;
        if(myStack.size() > 0) {
            last = myStack.remove((myStack.size() - 1));
            return (last);
        } else {
            return " Unable to pop!";
        }
    }

    /**
     * look at the value of, but don’t remove, the most recently pushed element
     * @return the last element in a list
     */

    public String peek()
    {
        if(myStack.size() > 0) {
            return (myStack.get(myStack.size() - 1));
        } else {
            return " Unable to peek !";
        }
    }
}





