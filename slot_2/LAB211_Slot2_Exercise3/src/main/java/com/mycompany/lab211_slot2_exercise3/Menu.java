/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot2_exercise3;

/**
 *
 * @author xcall
 */
public class Menu {

    public void run() {
        System.out.println("=====Calculator Shape Program=====");

        double width  = Validator.readPositiveDouble("Please input side width of Rectangle: ");
        double length = Validator.readPositiveDouble("Please input length of Rectangle: ");
        double radius = Validator.readPositiveDouble("Please input radius of Circle: ");
        double a      = Validator.readPositiveDouble("Please input side A of Triangle: ");
        double b      = Validator.readPositiveDouble("Please input side B of Triangle: ");
        double c      = Validator.readPositiveDouble("Please input side C of Triangle: ");

        Rectangle rect = new Rectangle(width, length);
        Circle cir     = new Circle(radius);
        Triangle tri   = new Triangle(a, b, c);

        rect.printResult();
        cir.printResult();
        tri.printResult();
    }
}

