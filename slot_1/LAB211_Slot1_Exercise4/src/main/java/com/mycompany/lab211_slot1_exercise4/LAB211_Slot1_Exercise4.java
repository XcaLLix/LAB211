/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab211_slot1_exercise4;

/**
 *
 * @author xcall
 */
import java.util.List;
import java.util.Scanner;

public class LAB211_Slot1_Exercise4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EquationProgram svc = new EquationProgram();

        while (true) {
            System.out.println("======== Equation Program =========");
            System.out.println("1. Calculate Superlative Equation");
            System.out.println("2. Calculate Quadratic Equation");
            System.out.println("3. Exit");
            System.out.print("Please choose one option: ");

            int choice;
            try { choice = Integer.parseInt(sc.nextLine().trim()); }
            catch (Exception e) { System.out.println("Invalid choice!\n"); continue; }

            if (choice == 3) {
                System.out.println("Bye!");
                break;
            }

            switch (choice) {
                case 1 -> {
                    System.out.println("----- Calculate Equation -----");
                    float a = readFloat(sc, "Enter A: ");
                    float b = readFloat(sc, "Enter B: ");

                    List<Float> ans = svc.calculateEquation(a, b);
                    if (ans == null) {
                        System.out.println("Solution: No solution.");
                    } else if (ans.isEmpty()) {
                        System.out.println("Solution: Infinitely many solutions.");
                    } else {
                        System.out.printf("Solution: x = %.3f%n", ans.get(0));
                    }

                    System.out.println("Number is Odd: " + Number.listToString(Number.filterOdds(a, b)));
                    System.out.println("Number is Even: " + Number.listToString(Number.filterEvens(a, b)));
                    System.out.println("Number is Perfect Square: " + Number.listToString(Number.filterSquares(a, b)));
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("----- Calculate Quadratic Equation -----");
                    float a = readFloat(sc, "Enter A: ");
                    float b = readFloat(sc, "Enter B: ");
                    float c = readFloat(sc, "Enter C: ");

                    List<Float> ans = svc.calculateQuadraticEquation(a, b, c);
                    if (ans == null) {
                        System.out.println("Solution: No real solution.");
                    } else if (ans.isEmpty()) {
                        System.out.println("Solution: Infinitely many solutions.");
                    } else if (ans.size() == 1) {
                        System.out.printf("Solution: x1 = x2 = %.3f%n", ans.get(0));
                    } else {
                        System.out.printf("Solution: x1 = %.3f and x2 = %.3f%n", ans.get(0), ans.get(1));
                    }

                    System.out.println("Odd Number(s): " + Number.listToString(Number.filterOdds(a, b, c)));
                    System.out.println("Number is Even: " + Number.listToString(Number.filterEvens(a, b, c)));
                    System.out.println("Number is Perfect Square: " + Number.listToString(Number.filterSquares(a, b, c)));
                    System.out.println();
                }
                default -> System.out.println("Please choose 1-3.\n");
            }
        }
        sc.close();
    }

    private static float readFloat(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine();
            if (Number.floatCheckIn(s)) return Float.parseFloat(s.trim());
            System.out.println("Invalid number. Try again.");
        }
    }
}

