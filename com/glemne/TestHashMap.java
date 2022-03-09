package com.glemne;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    static HashMap<String, Boolean> map = new HashMap<>();
    public static void main(String[] args) {
//        HashMap<String, String> cp = new HashMap<String, String >();
//        cp.put("England", "London");
//        cp.put("Germany", "Berlin");
//        cp.put("Norway", "Oslo");
//        cp.put("USA", "Washington DC");
//        System.out.println(cp);
//        System.out.println(cp.get("England"));
//        cp.remove("England");
//        System.out.println(cp.get("England"));

        map.put("Kenny", true);
        map.put("Joe", false);
        System.out.println(map.get("Kenny"));

        if(map.containsKey("Jack")) System.out.println(1);

        if(map.containsValue(Boolean.FALSE)) System.out.println(2);

        for(String s : map.keySet())
        {
            System.out.println(3);
        }

        for(Boolean b : map.values())
        {
            System.out.println(4);
        }

        for(Map.Entry kv : map.entrySet())
        {

        }
        map.remove("Kenny");


    }
}