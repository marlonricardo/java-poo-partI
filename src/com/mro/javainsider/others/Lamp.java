package com.mro.javainsider.others;

public class Lamp {
    private boolean on;

    public Lamp(boolean on){
        this.on = on;
    }
    void turnOn(){
        on = true;
    }

    void turnOff(){
        on = false;
    }

    void showState(){
        System.out.println("Lampada ligada? " + (on ? "ligada" : "desligada"));
    }
}
