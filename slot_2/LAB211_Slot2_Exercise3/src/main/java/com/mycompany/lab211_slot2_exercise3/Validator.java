/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot2_exercise3;

/**
 *
 * @author xcall
 */
import java.util.Scanner;

public class Validator {
    private static final Scanner sc = new Scanner(System.in);

    public static double readPositiveDouble(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                double v = Double.parseDouble(sc.nextLine().trim());
                if (v > 0) return v;
            } catch (NumberFormatException ignored) {}
            System.out.println("Please input a positive number.");
        }
    }
}
