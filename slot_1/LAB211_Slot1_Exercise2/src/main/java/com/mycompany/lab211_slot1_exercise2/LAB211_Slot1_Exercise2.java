/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab211_slot1_exercise2;

/**
 *
 * @author xcall
 */

import java.util.Scanner;

public class LAB211_Slot1_Exercise2  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of array: ");
        int n = sc.nextInt();

        System.out.print("Enter search value: ");
        int x = sc.nextInt();

        IntArray arr = new IntArray(n);

        System.out.println("The array: " + arr.toString());

        int idx = arr.indexOf(x);
        if (idx != -1) {
            System.out.println("Found " + x + " at index: " + idx);
        } else {
            System.out.println(x + " not found in array.");
        }

        sc.close();
    }
}