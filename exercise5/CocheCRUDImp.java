package com.exercise5;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImp implements CocheCRUD{
    List<Coche> coches = new ArrayList<>();

    @Override
    public void save(Coche coche) {
        coches.add(coche);
        System.out.println(coche.modelo + " has been added");
    }

    @Override
    public List<Coche> findAll() {
        return coches;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println(coche.modelo + " has been deleted");
    }
}
