package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Opel opel = new Opel(36);
        opel.steer(45);
        opel.accelerate(25);
        opel.accelerate(23);
        opel.accelerate(-40);
    }
}
