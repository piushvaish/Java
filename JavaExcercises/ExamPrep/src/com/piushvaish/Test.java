package com.piushvaish;

/**
 * Created by piush on 06/05/2016.
 */
public class Test {
    public static void main(String[] args) {
//        int big = 1234567890;
//        float approx = big;
//        System.out.println(big - (int) approx);
//        double f = 10.0000000;
//        System.out.println("byte: " + (byte)f);
//        int a = Integer.parseInt("123");
//        System.out.println(a);
        // output a star..
//        System.out.println("*\n**\n***\n****\n*****\n");
//        String s = "Hello";
//        //String sub = s.substring(2);
//
//        System.out.println(deleteAll(s,"l"));
//        //System.out.println(s.replaceAll("l","A"));
//        StringBuilder result = new StringBuilder(14).append("John").append(" ").append("Cary");
//        System.out.println(result);
        String s = "Hello";
        s = s.concat(" World!");
        System.out.println(s);
    }
    public static String removeCharAt(String s , int pos){
        return s.substring(0,pos) + s.substring(pos + 1);
    }
    public static String deleteAll(String s,String charToRemove){
        return s.replaceAll(charToRemove,"");
    }
}
