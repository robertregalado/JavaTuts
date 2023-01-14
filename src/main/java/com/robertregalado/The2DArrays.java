package com.robertregalado;

import java.util.Arrays;

public class The2DArrays {
    public static void main(String[] args) {
        char[][] boardOne = new char[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                boardOne[i][j] = '-';
            }
        }
        char[][] boardTwo = new char[][]{
            new char[]{'O','-','-'},
            new char[]{'O','-','-'},
            new char[]{'O','-','-'},
        };
        System.out.println(Arrays.deepToString(boardOne));
        System.out.println(Arrays.deepToString(boardTwo));
    }
}
