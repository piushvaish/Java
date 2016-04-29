package com.piushvaish;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by piush on 27/03/2016.
 */
public class ListDemo {
    public static void main(String[] args) {
        // write your code here
        LinkedList<String> staff = new LinkedList<String>();
        staff.addLast("Diana");
        staff.addLast("Harry");
        staff.addLast("Romeo");
        staff.addLast("Tom");

        ListIterator<String> iterator = staff.listIterator();
        iterator.next();
        iterator.next();

        //add more elements after second element
        iterator.add("Juliet");
        iterator.add("Nina");

        iterator.next();
        // removes the element before the cursor at this stage , hence romeo
        iterator.remove();
        System.out.println(staff);

    }
}
