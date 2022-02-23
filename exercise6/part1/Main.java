package com.exercise6.part1;

import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {
        String prueba = reverse("Hola mundo");
        System.out.println(prueba);
    }
    public static @NotNull
    String reverse(String text) {
        StringBuilder reversedText = new StringBuilder();

        for (int i = 1; i <= text.length(); i++) {
            reversedText.append(text.charAt(text.length() - i));
        }

        return reversedText.toString();
    }
}
