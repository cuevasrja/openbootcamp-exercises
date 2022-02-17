package com.exercise4;

public abstract class SmartDevice {
    public String brand;
    public String model;
    public String color;
    public String so;
    public double soVersion;
    public double size;
    public int year;

    public SmartDevice(){}

    public SmartDevice(String brand, String model, String color, String so, double soVersion, double size, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.so = so;
        this.soVersion = soVersion;
        this.size = size;
        this.year = year;
    }
}
