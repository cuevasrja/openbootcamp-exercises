package com.exercise6.part10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream cellphoneNumbers = new FileInputStream("src/com/exercise6/part10/resources/contacts.txt");
            byte[] byteNumbers = cellphoneNumbers.readAllBytes();
            ArrayList<String> numbers = findNumbers(byteNumbers);
            System.out.println("Los números disponibles son: " + numbers);
            System.out.println("------------------------------------------------");
            cellphoneNumbers.close();

            PrintStream backUp = new PrintStream("src/com/exercise6/part10/resources/backup.txt");
            HashMap<String, String> contacts = assignNumbers(numbers);
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                String contact = "Nombre: " + entry.getKey() + " - Número: " + entry.getValue() + "\n";
                byte[] convertContact = contact.getBytes(StandardCharsets.UTF_8);
                backUp.write(convertContact);
            }
            backUp.close();
            System.out.println("El respaldo fue realizado exitosamente");
        } catch (IOException e) {
            System.out.println("File was not found: " + e.getMessage());
        }
    }
    public static ArrayList<String> findNumbers(byte[] contacts){
        StringBuilder number = new StringBuilder();
        ArrayList<String> numbers = new ArrayList<>();
        for (byte b : contacts) {
            if (b == 32) {
                numbers.add(String.valueOf(number));
                number = new StringBuilder();
                continue;
            }
            number.append((char) b);
        }
        numbers.add(String.valueOf(number));
        return numbers;
    }
    public static HashMap<String, String> assignNumbers(ArrayList<String> numbers){
        HashMap<String, String> contacts = new HashMap<>();
        for (String number : numbers) {
            boolean ok = false;
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Por favor, asigne un nombre a " + number + ": ");
                try {
                    String name = scanner.next();
                    System.out.println("Se guardó el número " + number + " como: " + name);
                    System.out.println("------------------------------------------------");
                    contacts.put(name, number);
                    ok = true;
                } catch (InputMismatchException e) {
                    System.out.println("Nombre invalido: " + e.getMessage());
                }
            } while (!ok);
        }
        return contacts;
    }
}
