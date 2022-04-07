package com.reverse;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, String> m1 = new TreeMap<>();
        m1.put("map", "HashMap");
        m1.put("schildt", "java2");
        m1.put("mathew", "Hayden");
        m1.put("schildt", "java2");

        Set<String> keys = m1.keySet();
        for(String s: keys){
            System.out.println("Key::" + s + "Value::" + m1.get(s));
        }

        for(Map.Entry<String, String> entry:m1.entrySet()){
            System.out.println(entry.getKey() +  "-------" + entry.getValue());
        }

        /*Map<String, String> m1 = new HashMap<>();
        m1.put("map", "HashMap");
        m1.put("schildt", "java2");
        m1.put("mathew", "Hayden");
        m1.put("schildt", "java2");

        System.out.println(m1);
        System.out.println(m1.keySet());
        System.out.println(m1.values());

        Map<String, String> m1 = new LinkedHashMap<>();
        m1.put("map", "HashMap");
        m1.put("schildt", "java2");
        m1.put("mathew", "Hayden");
        m1.put("schildt", "java2");

        System.out.println(m1);
        System.out.println(m1.keySet());
        System.out.println(m1.values());*/

    }
}
