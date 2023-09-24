package com.mro.javainsider.others;

public class ExercLamp {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp(true);

        lamp1.showState();
        lamp1.turnOff();
        lamp1.showState();

        System.out.println();

        Lamp lamp2 = new Lamp(false);
        lamp2.showState();

        lamp2.turnOn();
        lamp2.showState();

    }
}
