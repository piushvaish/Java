package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by piush on 30/01/2016.
 */
public class MobilePhone {
    private String myNum;
    private ArrayList<ContactList> myContacts;

    public MobilePhone(String myNum){
        this.myNum = myNum;
        this.myContacts = new ArrayList<ContactList>();//new list
    }
    //adding method

    public boolean addNewContact(ContactList contactList){
        if(findContact(contactList.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contactList);
        return true;
    }
    public boolean updateContact(ContactList oldContact,ContactList newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }
        this.myContacts.set(foundPosition,newContact);
        System.out.println(oldContact.getName() + " , was replaced with" + newContact.getName());
        return true;
    }
    public boolean removeContact(ContactList contactList){
        int foundPosition = findContact(contactList);
        if(foundPosition < 0){
            System.out.println(contactList.getName() + ", was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contactList.getName() + " , was deleted.");
        return true;
    }
    private int findContact(ContactList contactList){
        return this.myContacts.indexOf(contactList);
    }
    private int findContact(String contactName){
        for(int i = 0; i< this.myContacts.size();i++){
            ContactList contactList = this.myContacts.get(i);
            if(contactList.getName().equals(contactName)){
                return i;
            }

        }
        return -1;
    }

    public String queryContact(ContactList contactList){
        if(findContact(contactList) >= 0){
            return contactList.getName();
        }
        return null;
    }
    public ContactList queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List");
        for(int i =0;i < this.myContacts.size();i++){
            System.out.println((i+1) + "." + this.myContacts.get(i).getName()
            + " ->" + this.myContacts.get(i).getPhoneNum());
        }
    }
}
