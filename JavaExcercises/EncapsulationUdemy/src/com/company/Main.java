package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(20,false);

        System.out.println("initial page counter = " + printer.getNumOfPagesPrinted());
        int pagesPrinted = printer.printPage(4);
        System.out.println("Pages printed was " + pagesPrinted +
                " new total print count for printer = " + printer.getNumOfPagesPrinted());

        pagesPrinted = printer.printPage(2);
        System.out.println("Pages printed was " + pagesPrinted +
                " new total print count for printer = " + printer.getNumOfPagesPrinted());


    }

}
