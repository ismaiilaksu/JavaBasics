package com.ismailaksu.javabasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {

    public static void main(String[] args) {
        String[] myStringArray=new String[4];

        myStringArray[0] = "Ismail";
        myStringArray[1] = "Aksu";
        myStringArray[2] = "Ankara";
        myStringArray[3] = "Kirikkale";

        System.out.println(myStringArray[0]);

        int[] myIntegerArray = new int[4];
        myIntegerArray[0] = 50;
        myIntegerArray[1] = 60;
        myIntegerArray[2] = 70;
        myIntegerArray[3] = 80;

        System.out.println(myIntegerArray[0]);

        int[] myNumberArray = {1,2,3,4,5,6,7,8,9};
        System.out.println(myNumberArray[2]);

        //Lists
        ArrayList<String> myMusicians = new ArrayList<String>();
        myMusicians.add("James");
        myMusicians.add("Lars");
        myMusicians.add(1,"Kirk");
        myMusicians.add("Rob");

        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(3));

        System.out.println(myMusicians.size());

        //Set
        HashSet<String> mySet = new HashSet<String>();
        mySet.add("James");
        mySet.add("James");
        System.out.println(mySet.size());

        //HashMap
        HashMap<String, String> myHashMap = new HashMap<String, String>();
        myHashMap.put("name", "James");
        myHashMap.put("Instrument","Guitar");

        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("Instrument"));

        HashMap<String, Integer> mySecondMap = new HashMap<String, Integer>();
        mySecondMap.put("run", 100);
        mySecondMap.put("basketball", 200);
        System.out.println(mySecondMap.get("run"));

    }
}
