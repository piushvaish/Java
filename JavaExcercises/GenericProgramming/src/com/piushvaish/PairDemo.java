package com.piushvaish;

import static java.lang.Math.E;

/**
 * for further information:
 * http://math.hws.edu/javanotes/c10/s1.html
 * https://docs.oracle.com/javase/tutorial/java/generics/why.html
 * Types are erased by the virtual machine to Object
 * in case of fillwithdefault [] rectangle values have a default value
 * you cannot use generics in static variables,static methods,or static inner classes
 */

public class PairDemo {

    public static void main(String[] args) {
	// write your code here
        String [] names = {"Tom","Diana","Harry"};
        Pair<String, Integer> result = firstcontaining(names, "a");
        System.out.println(result.getFirst());
        System.out.println(result.getSecond());
    }

    /**
     * Get the first String containing a given string,together with its index
     * @param strings
     * @param sub
     * @return
     */
    public static Pair<String,Integer> firstcontaining(String[] strings,String sub){
        for(int i = 0;i <strings.length;i++){
            if(strings[i].contains(sub)){
                return new Pair<String,Integer>(strings[i],i);
            }
        }
        return new Pair<String,Integer>(null,-1);
    }

    /**
     * Constraining parameter types
     * Comparable bound is necessary for compareTo
     * Inheritence of type parameters doesnot lead to inheritence of generic classes
     * @param a
     * @param <E>
     * @return
     */
    public static < E extends Comparable> E min(E[] a){
        E smallest = a[0];
        for(int i =0; i<a.length;i++)
            if(a[i].compareTo(smallest) < 0)smallest = a[i];
            return smallest;

    }
}
