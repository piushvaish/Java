package com.piushvaish;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50,true);
        System.out.printf("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new totoal count for printer = " + printer.getPagesPrinted());
    }
}
