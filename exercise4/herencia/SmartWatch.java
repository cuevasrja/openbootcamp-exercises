package com.exercise4.herencia;

import com.exercise4.SmartDevice;

public class SmartWatch extends SmartDevice {
    public boolean data;
    public boolean heartMonitor;
    public boolean gps;
    public String bandColor;

    public SmartWatch(){}

    public SmartWatch(boolean data, boolean heartMonitor, boolean gps, String bandColor) {
        this.data = data;
        this.heartMonitor = heartMonitor;
        this.gps = gps;
        this.bandColor = bandColor;
    }
}
