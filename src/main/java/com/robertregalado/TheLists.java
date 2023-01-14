package com.robertregalado;

import java.util.ArrayList;
import java.util.List;


public class TheLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("green");

        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("green"));
        System.out.println(colors.isEmpty());

        for (String color : colors){
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
