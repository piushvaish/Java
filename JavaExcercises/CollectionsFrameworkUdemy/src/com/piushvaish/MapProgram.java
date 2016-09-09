package com.piushvaish;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by piush on 20/08/2016.
 */
public class MapProgram {
    public static void main(String[] args) {
        // if you happen to add a reserved name , just add java.util.(reserved word)
        Map<String, String> languages = new HashMap<>();
        //you can use the put method for checking if a value is already exists
        //putifabsent: if a key is not present. Only for concurrency issues.
        //hashmap doesnot guarantee correct order.
        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level,object-oriented,platform independent languages");
            System.out.println("Java added successfully");
        }
        languages.put("Java", "a compiled high level,object-oriented,platform independent languages");
        languages.put("Python", "an interpreted,object-oriented,high level language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("Basic", "Beginners AllPurpose Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");
        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "This course is about java");
        }
        //System.out.println(languages.get("Java"));
        //Hashmap allows one unique key for each pair. Otherwise it gets overwritten

        // System.out.println(languages.get("Java"));

        System.out.println("=====================================");
        //to remove
        //languages.remove("Lisp");
        /*if(languages.remove("Algol","a family of algorithmic languages")){
            System.out.println("Algol removed");
        }else{
            System.out.println("Algol not removed, key/value pair not found");
        }*/

        //replace method if you updating a name or address
        if (languages.replace("Lisp", "Therein lies madness", " a functional programming language with imperative features")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not removed");
        }
        //System.out.println(languages.replace("Scala","this will not be added"));
        for (String key : languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }
    }

}
