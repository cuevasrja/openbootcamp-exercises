package com.exercise2;

public class CalculadoraDeIVA {
    public static void main(String[] args) {
        double precioTotal1 = calcularPrecioTotal(20.5);
        System.out.println(precioTotal1);

        double precioTotal2 = calcularPrecioTotal(16.5);
        System.out.println(precioTotal2);
    }
    static double calcularPrecioTotal(double precio){
        double iva = 0.16;
        return precio + precio*iva;
    }
}
