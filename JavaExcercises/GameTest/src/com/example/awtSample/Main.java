package com.example.awtSample;

import com.example.game.Isaveable;
import com.example.game.Monster;
import com.example.game.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Player tim = new Player("Tim",10,15);
        //System.out.println(tim.toString());
        saveobject(tim);
        tim.setHitpoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveobject(tim);
        //loadObject(tim);
        System.out.println(tim);

        Isaveable werewolf = new Monster("Werewolf",20,40);
        //casting
        System.out.println(" Strength = " + ((Monster)werewolf).getStrength());
        System.out.println(werewolf);
        saveobject(werewolf);

    }
    public static ArrayList<String> readyValues(){
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                            "1 to enter a string\n" +
                             "0 to quit");
        while (!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringinput = scanner.nextLine();
                    values.add(index,stringinput);
                    index++;
                    break;
            }
        }
        return values;

    }
    public static void saveobject(Isaveable objectToSave){
        for(int i = 0;i<objectToSave.write().size();i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }
    public static void loadObject(Isaveable objectToLoad){
        ArrayList<String> values = readyValues();
        objectToLoad.read(values);
    }
}
