package com.piushvaish;

public class Main {

    public static void main(String[] args) {

        Builder blueBuilder = new Builder(BlueFactory);
        blueBuilder.build();


        Builder redBuilder = new Builder(RedFactory);
        redBuilder.build();

    }
}
