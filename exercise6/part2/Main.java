package com.exercise6.part2;

import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Juan", "Jesus", "Jose"};

        runArray(names);
    }
    public static void runArray(String @NotNull [] array){
        for (String string: array) {
            System.out.println(string);
        }
    }
}
