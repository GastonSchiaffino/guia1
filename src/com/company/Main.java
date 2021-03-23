package com.company;

import com.company.ejercicio1.rectangle;

public class Main {

    public static void main(String[] args) {

        rectangle rectangle = new rectangle();
        System.out.println("Ancho: " +rectangle.getBroad());
        System.out.println("Altura: " +rectangle.getHeight());
        System.out.println("Area: " +rectangle.calculateArea());
        System.out.println("Perimetro: " +rectangle.calculatePerimeter());

        rectangle.setBroad(5);
        rectangle.setHeight(7);
        System.out.println("Area: " +rectangle.calculateArea());
        System.out.println("Perimetro: " +rectangle.calculatePerimeter());
    }

}
