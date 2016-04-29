package com.company;

import java.util.ArrayList;

/**
 * Created by piush on 30/01/2016.
 */
public class ContactList {
    private String name;
    private  String phoneNum;

    public ContactList(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public static ContactList createContact(String name,String phoneNum) {
        return new ContactList(name, phoneNum);
    }

}



