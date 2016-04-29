package com.piushvaish;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = getIntEAFP();
        System.out.println("x is " + x);
    }
    private static int getInt(){
    Scanner s = new Scanner(System.in);
        return s.nextInt();
    }
    //Look before you leap kind of Error handling
    private static int getIntLBYL(){
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an Integer  ");
        String input = s.next();
        for(int i = 0; i<input.length();i++){
            if(!Character.isDigit(input.charAt(i))){
                isValid = false;
                break;
            }
        }
        if(isValid){
            return Integer.parseInt(input);
        }
        return 0;

    }
    // Easy to ask for forgiveness and permission
    private static int getIntEAFP(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an Integer  ");
        try{
            return s.nextInt();
        } catch (InputMismatchException e){
            return 0;
        }
    }
}
