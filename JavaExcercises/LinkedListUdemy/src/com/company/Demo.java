package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by piush on 17/04/2016.
 */
public class Demo {
    public static void main(String[] args) {
        LinkedList<String > placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Darwin");
        //printList(placesToVisit);
        addInOrder(placesToVisit,"Alice Spring");
        //addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);
        visit(placesToVisit);

//        printList(placesToVisit);
//        placesToVisit.add(3,"Alice Springs");
//        printList(placesToVisit);
//        placesToVisit.remove(5);
//        printList(placesToVisit);
    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("====================");
    }
    private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        //it is not the first one
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                //equal,do not add
                System.out.println(newCity + " is already added as a destination");
            } else if(comparison > 0){
                //new city should be added before this one
                //brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparison < 0){
                //move to next city

            }
        }
        stringListIterator.add(newCity);
        return true;

    }
    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingforward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if(cities.isEmpty()){
            System.out.println("No cities in the iternrary");
            return;
        }else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if(!goingforward){
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingforward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list ");
                        goingforward = false;
                    }
                    break;
                case 2:
                    if(goingforward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingforward =false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingforward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;

            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 to quit\n" +
        "1 - go the next city\n" +
        "2 - go to previous city\n" +
        "3 - print menu options");
    }
}
