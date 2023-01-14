package com.robertregalado;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "blue";
        colors[1] = "gold";
        colors[2] = "purple";
        colors[3] = "brown";
        colors[4] = "green";

        System.out.println(Arrays.toString(colors));

        System.out.println("====Forward Printing====");
        for (int i = 0; i < colors.length; i++){
            System.out.println(colors[i]);
        }

        System.out.println("=====Reverse Printing====");
        for (int i = colors.length-1; i >= 0 ; i--){
            System.out.println(colors[i]);
        }
        System.out.println("=====Enhance for loop=======");
        for (String color: colors){
            System.out.println(color);
        }
        System.out.println("======Printing using forEach=====");
        Arrays.stream(colors).forEach(System.out::println);
    }
}
