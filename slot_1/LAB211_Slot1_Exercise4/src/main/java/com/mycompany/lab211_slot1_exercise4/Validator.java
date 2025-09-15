/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot1_exercise4;

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

    public static float readFloat(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Float.parseFloat(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid float, try again!");
            }
        }
    }
}

