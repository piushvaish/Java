package com.piushvaish;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws  Exception{
	// write your code here
        ItemListParser parser = new ItemListParser();
        ArrayList <LineItem> items = parser.parse("items.xml");
        for(LineItem anItem : items){
            System.out.println(anItem.format());
        }

    }
}
