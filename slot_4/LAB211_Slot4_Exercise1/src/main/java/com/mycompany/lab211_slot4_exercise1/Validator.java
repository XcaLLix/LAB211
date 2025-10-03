/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot4_exercise1;

/**
 *
 * @author xcall
 */
import java.util.Scanner;

public class Validator {
    private static final Scanner sc = new Scanner(System.in);

    public static int readInt(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer, try again!");
            }
        }
    }
    
    public static String readString(String msg) {
        while (true) {
            System.out.print(msg);
            String input = sc.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Input cannot be empty. Please try again!");
        }
    }
}