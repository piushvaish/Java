package com.company;

/**
 * Created by piush on 12/04/2017.
 */
public class Contacts {
    private String names;
    private String phoneNumber;

    public Contacts(String names, String phoneNumber) {
        this.names = names;
        this.phoneNumber = phoneNumber;
    }

    public String getNames() {
        return names;
    }

       public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacts createContact(String name, String phoneNumber){
        return new Contacts(name,phoneNumber);
    }




}
