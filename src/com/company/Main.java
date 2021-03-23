package com.company;

import com.company.ejercicio1.rectangle;
import com.company.ejercicio2.employee;
import com.company.ejercicio3.saleItem;

public class Main {

    public static void main(String[] args) {

        /// Ejercicio 1
        rectangle rectangle = new rectangle();
        System.out.println("Ancho: " +rectangle.getBroad());
        System.out.println("Altura: " +rectangle.getHeight());
        System.out.println("Area: " +rectangle.calculateArea());
        System.out.println("Perimetro: " +rectangle.calculatePerimeter());

        rectangle.setBroad(5);
        rectangle.setHeight(7);
        System.out.println("Area: " +rectangle.calculateArea());
        System.out.println("Perimetro: " +rectangle.calculatePerimeter());

        ///Ejercicio 2
        ///Inciso A
        employee employee1 = new employee();
        employee employee2 = new employee();

        employee1.setName("Carlos");
        employee1.setSurname("Gutierrez");
        employee1.setDni("23456345");
        employee1.setSalary(25000);

        ///Inciso B
        employee2.setName("Ana");
        employee2.setSurname("Sanchez");
        employee2.setDni("34234123");
        employee2.setSalary(27500);

        ///Inciso C
        System.out.println( employee1.getEmployee());
        System.out.println( employee2.getEmployee());

        ///Inciso D
        employee1.increaseSalary(15);
        System.out.println("Salario Anual Aumentado: " + employee1.calculateAnnualSalary());

        ///Ejercicio 3
        saleItem item1 = new saleItem();

        ///Inciso A
        item1.setId(4);
        item1.setDescription("Papas Pringles");
        item1.setAmount(20);
        item1.setUnitaryPrice(193);
        ///Inciso B
        System.out.println( item1.getsaleItem());
    }

}
