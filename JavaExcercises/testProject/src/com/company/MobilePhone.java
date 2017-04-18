package com.company;
import com.company.Contacts;

import java.util.ArrayList;

/**
 * Created by piush
 *
 **/
public class MobilePhone {

    private String myNumber;

    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    public boolean addnewContact(Contacts contact){
        if(findContact(contact.getNames()) >=0){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    public boolean updateContact(Contacts oldContact,Contacts newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition <0){
            System.out.println(oldContact.getNames() + " , was not found");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getNames() + " was replaced with " + newContact);
        return true;
    }
    public void printContacts(){
        System.out.println("Contact List");

        for(int i = 0;i<this.myContacts.size();i++){
            System.out.println((i+ 1) + "." +
            this.myContacts.get(i).getNames() + " ->" +
            this.myContacts.get(i).getPhoneNumber());
        }
    }
    public Contacts queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }
    public boolean removeContact(Contacts contact){
        int foundPosition = findContact(contact);
        if(foundPosition <0){
            System.out.println(contact.getNames() + " , was not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getNames() + " was deleted");
        return true;



    }

    public String queryContact(Contacts contact){
        if(findContact(contact) >= 0){
            return contact.getNames();
        }
        return null;
    }
    private int findContact(Contacts contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i = 0; i < this.myContacts.size();i++){
          Contacts contact = this.myContacts.get(i);
          if(contact.getNames().equals(contactName)){
              return i;
          }
        }
        return -1;
    }
}
