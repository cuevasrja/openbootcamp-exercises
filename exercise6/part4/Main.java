package com.exercise6.part4;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>(5);
        names.add("Juan");
        names.add("Pepe");
        names.add("Jesus");
        names.add("Arturo");
        names.add("Victor");

        names.remove(2);
        names.remove(1);

        System.out.println(names);
    }
}
