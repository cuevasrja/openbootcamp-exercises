package com.exercise3;

public class Concatenador {
    public static void main(String[] args) {
        String[] prueba1 = {"Hola", "mi", "nombre", "es", "Juan"};
        String fraseCompleta = concatenador(prueba1);
        System.out.println(fraseCompleta);
    }
    static String concatenador(String[] words){
        String frase = "";
        for (int i = 0; i < words.length; i++) {
            if (i == 0){
                frase = frase.concat(words[i]);
            } else {
                frase = frase.concat(" " + words[i]);
            }
        }
        return frase;
    }
}
