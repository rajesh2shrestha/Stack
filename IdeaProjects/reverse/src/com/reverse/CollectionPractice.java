package com.reverse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionPractice {
    public static void main(String[] args) {
       /* String name = "rajesh shrestha";
        char[] ch = name.toCharArray();

        Set<Character> a = new HashSet<>();
        int count = 0;
        for(char c : ch){
           if(!a.add(c)){
               count++;
           }
    }
        System.out.println(count);
        System.out.println(a);*/
        String name = "rajesh shrestha";
        name = name.replaceAll("\\s", "");
        char[] ch = name.toCharArray();

        List<Character> list = new ArrayList<>();
        int count = 0;
        for(char c: ch){
            if(list.contains(c)){
                count++;
            }else{
                list.add(c);
            }
        }
        System.out.println(list);
        System.out.println(count);


    }



    }

