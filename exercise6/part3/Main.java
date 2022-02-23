package com.exercise6.part3;

import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 15;
        matrix[0][1] = 5;
        matrix[0][2] = 65;

        matrix[1][0] = 24;
        matrix[1][1] = 7;
        matrix[1][2] = 6;

        matrix[2][0] = 1;
        matrix[2][1] = 52;
        matrix[2][2] = 32;

        runArray(matrix);
    }
    public static void runArray(int[] @NotNull [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Estamos en i=" + i);
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Estamos en i=" + i + " j=" + j + " con valor: " + array[i][j]);
            }
        }
    }
}
