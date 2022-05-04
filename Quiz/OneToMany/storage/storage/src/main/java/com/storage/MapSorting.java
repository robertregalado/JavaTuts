package com.storage;

import java.util.*;
class MapSorting{
    public static void main(String args[]){
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("Amit",104);
        map.put("Vijay",103);
        map.put("Rahul",100);
        map.put("Dictionary",880);
        map.put("Spotify",774);
        map.put("Workout",354);
        map.put("ML",1034);
        map.put("Me Daily",6088);
        map.put("Twitter",1068);

        //Elements can traverse in any order
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getValue() + " " + m.getKey() );
        }
    }
}
