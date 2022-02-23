package com.exercise6.part7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            if (i%2 != 0){
                arrayList.add(i);
            }
        }
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
    }
}
