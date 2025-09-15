/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot1_exercise3;

/**
 *
 * @author xcall
 */
import java.util.Scanner;

public class Menu {
    private final Scanner sc = new Scanner(System.in);


    public int chooseBase(String title) {
        while (true) {
            System.out.println(title);
            System.out.println("1. Binary (2)");
            System.out.println("2. Decimal (10)");
            System.out.println("3. Hexadecimal (16)");
            System.out.print("Your choice: ");
            String in = sc.nextLine().trim();
            switch (in) {
                case "1": return 2;
                case "2": return 10;
                case "3": return 16;
                default: System.out.println("Invalid choice, try again!\n");
            }
        }
    }


    public String inputValue(int base) {
        System.out.print("Enter input value (base " + base + "): ");
        return sc.nextLine().trim();
    }



}
