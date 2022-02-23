package com.exercise6.part8;

public class Main {
    public static void main(String[] args) {
        try {
            dividePorCero(15,0);
        } catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse: " + e.getMessage());
        } finally {
            System.out.println("Demo de código");
        }
    }
    public static void dividePorCero(int a, int b) throws ArithmeticException{
        int result = a / b;
        System.out.println(result);
    }
}
