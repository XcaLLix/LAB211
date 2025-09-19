/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot2_exercise1;

/**
 *
 * @author xcall
 */
import java.util.Scanner;
import java.util.Set;

public class Validator {
    static Scanner sc = new Scanner(System.in);
    
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
    public static double  readDouble(String msg){
        
        while (true){
            try {
                System.out.print(msg + " ");
                double x = Double.parseDouble(sc.nextLine());
                return x;
            }
            catch (NumberFormatException e){
                System.out.println("Try again");
            }
        }
    }
    
    public static String readOperator(String message) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();
            if (!input.isEmpty() && Set.of("=", "-", "+", "*", "/", "^").contains(input)) {
                return input;
            } else {
                System.out.println("Please input (+, -, *, /, ^)");
            }
        }
    }
    
    public static double  readDoubleBMI(String msg){   
        while (true){
            try {
                System.out.print(msg + " ");
                double x = Double.parseDouble(sc.nextLine());
                if (x <= 0) {
                    System.out.println("BMI is digit");
                    continue;
                }
                return x;
            }
            catch (NumberFormatException e){
                System.out.println("BMI is digit");
            }
        }
    }
}
