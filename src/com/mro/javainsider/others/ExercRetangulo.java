package com.mro.javainsider.others;

public class ExercRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo(10, 5);
        System.out.println(retangulo1.square());

        Retangulo retangulo2 = new Retangulo(10);
        System.out.println(retangulo2.square());
    }
}
