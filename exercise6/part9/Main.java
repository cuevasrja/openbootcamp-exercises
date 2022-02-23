package com.exercise6.part9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream fileIn = new FileInputStream("src/com/exercise5/part9/example/archivo1.txt");
            byte[] fichero = fileIn.readAllBytes();
            for (byte data: fichero) {
                System.out.println((char) data + " " + data);
            }
            fileIn.close();

            PrintStream fileOut = new PrintStream("src/com/exercise5/part9/example/archivo2.txt");
            fileOut.write(fichero);
            fileOut.close();

        } catch (IOException e){
            System.out.println("Este programa da error: " + e.getMessage());
        }


    }
}
