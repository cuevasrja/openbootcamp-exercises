package com.exercise4;

import com.exercise4.herencia.SmartPhone;
import com.exercise4.herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {
        SmartWatch galaxyWatch = new SmartWatch(true,true, true, "Black");
        galaxyWatch.brand = "Samsung";
        galaxyWatch.model = "SM-R800";
        galaxyWatch.color = "black";
        System.out.println(galaxyWatch.model);
        System.out.println(galaxyWatch.heartMonitor);

        SmartPhone iPhone12 = new SmartPhone(false, true, "Movistar");
        iPhone12.brand = "Apple";
        iPhone12.model = "iPhone 12";
        iPhone12.color = "Silver";
        System.out.println(iPhone12.brand);
        System.out.println(iPhone12.headphonePort);
    }
}
