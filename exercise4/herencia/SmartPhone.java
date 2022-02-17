package com.exercise4.herencia;

import com.exercise4.SmartDevice;

public class SmartPhone extends SmartDevice {
    public boolean headphonePort;
    public boolean data5g;
    public String operator;

    public SmartPhone(){}

    public SmartPhone(boolean headphonePort, boolean data5g, String operator){
        this.headphonePort = headphonePort;
        this.data5g = data5g;
        this.operator = operator;
    }
}
