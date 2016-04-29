package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Hamburger hamburger = new Hamburger("Basic","White","Sausage",3.50);
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato",0.25);
        hamburger.addHamburgerAddition2("Cheese",1.25);
        hamburger.addHamburgerAddition3("Lettuce",0.50);
        System.out.println("total burger price is " + hamburger.itemizeHamburger());
HealthyBurger hamburger1 = new HealthyBurger("Bacon",6.00);
        hamburger1.addHealthyAddition1("Bacon",3.00);
        hamburger1.addHealthyAddition2("Lentils",4.25);
        System.out.println(" healthy hamburger " + hamburger1.itemizeHamburger());

    DeluxHamburger db = new DeluxHamburger();
    db.itemizeHamburger();
    }
}
