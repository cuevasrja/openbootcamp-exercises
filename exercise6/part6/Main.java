package com.exercise6.part6;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Juan");
        arrayList.add("Jesus");
        arrayList.add("Jose");
        arrayList.add("Arturo");

        LinkedList<String> linkedList = new LinkedList<>(arrayList);

        System.out.println("Printing ArrayList...");
        for (String item: arrayList) {
            System.out.println(item);
        }

        System.out.println("Printing LinkedList...");
        for (String item: linkedList) {
            System.out.println(item);
        }
    }
}
