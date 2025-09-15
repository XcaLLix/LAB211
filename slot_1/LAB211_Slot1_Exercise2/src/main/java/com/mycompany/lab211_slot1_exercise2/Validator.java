/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot1_exercise2;

/**
 *
 * @author xcall
 */
import java.util.Scanner;
public class Validator {
    static Scanner sc = new Scanner(System.in);
    
    public static int  inportNumber(String msg){
        
        while (true){
            try {
                System.out.print(msg + " ");
                int x = Integer.parseInt(sc.nextLine());
                if (x < 1) {
                    System.out.println("Try again.");
                    continue;
                }
                return x;
            }
            catch (NumberFormatException e){
                System.out.println("Try again");
            }
        }
    }
}
