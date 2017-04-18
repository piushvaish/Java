package com.piushvaish;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger hamburger = new Hamburger("Basic", "Sausage",3.56,"White");

        double price = hamburger.itemizehamburger();


        hamburger.addHamburgerAddition1("Tomato",0.27);
        hamburger.addHamburgerAddition2("Lettuce",0.75);
        hamburger.addHamburgerAddition3("Cheese",1.12);
        hamburger.addHamburgerAddition1("Pickle",.45);
        System.out.println("total hamburger price is " + hamburger.itemizehamburger());

        HealthyBurger healthyBurger= new HealthyBurger("Bacon",5.67);
        healthyBurger.itemizehamburger();
        healthyBurger.addHealthAddition1("Egg",5.43);

        healthyBurger.addHealthAddition2("Lentils", 3.41);
        System.out.println("total healthy hamburger price is " + healthyBurger.itemizehamburger());

    DeluxeBurger db = new DeluxeBurger();
    db.itemizehamburger();
    }
}
