package com.company;

public class Main {

    public static void main(String[] args) {
        VipCustomer ann = new VipCustomer();
        System.out.println(ann.getName() +  ann.getCreditLimit() + ann.getEmailAddress());
        VipCustomer bob = new VipCustomer("bob", 999.0);
        System.out.println(bob.getName() + bob.getCreditLimit() + bob.getEmailAddress());

        VipCustomer gaby = new VipCustomer("gaby",777,"gaby@gmail.com");
        System.out.println(gaby.getName() + gaby.getCreditLimit() + gaby.getEmailAddress());
//        BankAccount tim = new BankAccount("Tim","tim@about.com","12345");
//        System.out.println(tim.getNumber());
//        System.out.println(tim.getCustomerName());

//        BankAccount manoo = new BankAccount();
//        System.out.println(manoo.getNumber());
//
//        System.out.println(manoo.getBalance());
        //BankAccount bob = new BankAccount("1234",12.00,"bob","bob@example.com","087123456");
        /*System.out.println(bob.getNumber());
        manoo.setNumber("1234567");
        System.out.println(manoo.getNumber());
        manoo.setBalance(1000);
        System.out.println(manoo.getBalance());
        manoo.setCustomerName("manoo");
        System.out.println(manoo.getCustomerName());
        manoo.setEmail("manoo@gmail.com");
        System.out.println(manoo.getEmail());
        manoo.setPhoneNumber("21345");
        System.out.println(manoo.getPhoneNumber());
        manoo.withdrawCash(1234);
        manoo.depositCash(123);*/

	    /*Car porsche = new Car();
        Car holden = new Car();
        //System.out.println(" Model is " + porsche.getModel());
        porsche.setModel("911");
        System.out.println(" Model is " + porsche.getModel());*/



    }
}
