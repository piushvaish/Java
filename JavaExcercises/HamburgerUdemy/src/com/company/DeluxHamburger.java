package com.company;

/**
 * Created by piush on 24/01/2016.
 */
public class DeluxHamburger extends Hamburger{
    public DeluxHamburger() {
        super("Delux", "White","Beef",14.50);
        super.addHamburgerAddition1("chips",2.50);
        super.addHamburgerAddition2("Drink",3.00);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("cannot add");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("cannot");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("cannot");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("cannot");
    }
}
