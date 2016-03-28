package com.piushvaish;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String[] args) {
	Map<String, Color> favoriteColors = new HashMap<String,Color>();
        favoriteColors.put("Juliet" , Color.BLUE);
        favoriteColors.put("Romeo",Color.GREEN);
        favoriteColors.put("Adam",Color.RED);
        favoriteColors.put("Eve",Color.BLUE);

        //print all keys and values
        Set<String> keySet = favoriteColors.keySet();
        for(String key : keySet){
            Color value = favoriteColors.get(key);
            System.out.println(key + " : " + value);
        }


    }
}
