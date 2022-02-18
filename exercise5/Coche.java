package com.exercise5;

public class Coche {
    // 1. atributos
    protected String fabricante;
    protected String modelo;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected int speed;

    // 2. constructores
    public Coche(){

    }

    public Coche(String fabricante, String modelo, double cc, int year, boolean sport, int speed) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
    }

    public Coche(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    // 3. métodos (comportamiento)
    public void acelerar(int quantity){
        this.speed += quantity;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cc=" + cc +
                ", year=" + year +
                ", sport=" + sport +
                ", speed=" + speed +
                '}';
    }
}
