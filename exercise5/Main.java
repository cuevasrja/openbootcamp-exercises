package com.exercise5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCRUD = new CocheCRUDImp();

        Coche aventador = new Coche("Lamborghini", "Aventador");
        Coche porsche911 = new Coche("Porsche", "911");
        Coche corolla = new Coche("Toyota", "Corolla");
        Coche mustang = new Coche("Ford", "Mustang");

        cocheCRUD.save(aventador);
        cocheCRUD.save(porsche911);
        cocheCRUD.save(corolla);
        cocheCRUD.save(mustang);

        System.out.println("----------------------------");

        List<Coche> coches = cocheCRUD.findAll();
        System.out.println(coches);

        System.out.println("----------------------------");

        cocheCRUD.delete(corolla);
    }
}
