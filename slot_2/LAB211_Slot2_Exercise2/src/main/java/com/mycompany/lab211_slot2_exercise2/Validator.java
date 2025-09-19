/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot2_exercise2;

/**
 *
 * @author xcall
 */
import java.util.Scanner;

public class Validator {
    private static final Scanner SC = new Scanner(System.in);

    public static int readPositiveInt(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                int v = Integer.parseInt(SC.nextLine().trim());
                if (v > 0) return v;
            } catch (NumberFormatException ignore) {}
            System.out.println("Value of matrix is digit"); 
        }
    }

    public static double readDouble(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Double.parseDouble(SC.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Value of matrix is digit");
            }
        }
    }

    public static int readMenuChoice(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                int c = Integer.parseInt(SC.nextLine().trim());
                if (c >= 1 && c <= 4) return c;
            } catch (NumberFormatException ignore) {}
            System.out.println("Please choose 1-4");
        }
    }
}

