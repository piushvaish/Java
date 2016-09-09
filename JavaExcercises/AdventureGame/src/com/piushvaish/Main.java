package com.piushvaish;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer,Location> locations = new HashMap<Integer, Location>();
    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",null));

        // map literals is not available in java.
        // http://stackoverflow.com/questions/6802483/how-to-directly-initialize-a-hashmap-in-a-literal-way
        tempExit = new HashMap<String, Integer>();
        tempExit.put("W",2);
        //Using regular expressions

        //tempExit.put("W",2);
        tempExit.put("E",3);
        tempExit.put("S",4);
        tempExit.put("N",5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));

        // tempExit.put("Q",0);
        tempExit = new HashMap<String, Integer>();
        tempExit.put("N",5);
       // tempExit.put("Q",0);
        locations.put(2, new Location(2, "You are at top of the hill",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W",1);
       // tempExit.put("Q",0);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N",1);
        tempExit.put("W",2);
       // tempExit.put("Q",0);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("S",1);
        tempExit.put("W",2);
       // tempExit.put("Q",0);
        locations.put(5, new Location(5, "You are in the forest",tempExit));

        Map<String,String> vocabulary = new HashMap <String,String>();
        vocabulary.put("Quit","Q");
        vocabulary.put("North","N");
        vocabulary.put("South","S");
        vocabulary.put("West","W");
        vocabulary.put("East","E");


        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            tempExit.remove("S");
            if (loc == 0) {
                break;

            }
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }

            System.out.println();
            String direction = scanner.nextLine().toUpperCase();
            if (direction.length() > 1) {
                String[] words = direction.split(" ");
                for (String word: words) {
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }
            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
//            loc = scanner.nextInt();
//            if(!locations.containsKey(loc)){
//                System.out.println("You cannot go in that direction");
//            }


        //string split method

//        String[] road = "You are standing at the end of a road before a small brick building".split(" ");
//        for(String i : road){
//            System.out.println(i);
//        }
//        System.out.println("====================================");
//        String[] building = "You are inside a building , a well house for a small spring".split(", ");
//        for(String i : building){
//            System.out.println(i);
//        }

    }
}
