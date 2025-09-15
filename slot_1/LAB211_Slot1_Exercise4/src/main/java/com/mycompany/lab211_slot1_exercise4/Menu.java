/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot1_exercise4;

/**
 *
 * @author xcall
 */
import java.util.List;

public class Menu {

    public void run() {
        while (true) {
            System.out.println("========= Equation Program =========");
            System.out.println("1. Calculate Linear Equation (ax + b = 0)");
            System.out.println("2. Calculate Quadratic Equation (ax^2 + bx + c = 0)");
            System.out.println("3. Exit");

            int choice = Validator.readInt("Your choice: ");
            if (choice == 3) {
                break;
            }

            if (choice == 1) {
                float a = Validator.readFloat("Enter a: ");
                float b = Validator.readFloat("Enter b: ");
                EquationProgram eq = new EquationProgram(a, b);
                printSolution(eq.calculateEquation());
                eq.reportClassify();

            } else if (choice == 2) {
                float a = Validator.readFloat("Enter a: ");
                float b = Validator.readFloat("Enter b: ");
                float c = Validator.readFloat("Enter c: ");
                EquationProgram eq = new EquationProgram(a, b, c);
                printSolution(eq.calculateQuadraticEquation());
                eq.reportClassify();

            } else {
                System.out.println("Invalid choice!");
            }
            System.out.println();
        }
    }

    private void printSolution(List<Float> ans) {
        if (ans == null) {
            System.out.println("No solution.");
        } else if (ans.isEmpty()) {
            System.out.println("Infinitely many solutions.");
        } else if (ans.size() == 1) {
            System.out.println("x = " + ans.get(0));
        } else {
            System.out.println("x1 = " + ans.get(0) + ", x2 = " + ans.get(1));
        }
    }
}

