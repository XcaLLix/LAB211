/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot1_exercise1;

import java.util.Scanner;

/**
 *
 * @author xcall
 */
    
public class Validator {
    private static final Scanner sc = new Scanner(System.in);   
    public static String readString(String message) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            } else {
                System.out.println("Input cannot be empty! Please try again.");
            }
        }
    }
}
