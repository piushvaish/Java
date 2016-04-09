package com.piushvaish;

public class Main {

    public static void main(String[] args) {
	// This program as Greeting thread runner
        GreetingRunnable r1 = new GreetingRunnable(" Hello ! World");
        GreetingRunnable r2 = new GreetingRunnable(" Good bye ! World");
        // Sometimes the second thread jumps ahead of the first one
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
