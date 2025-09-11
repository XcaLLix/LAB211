/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab211_slot1_exercise1;

/**
 *
 * @author xcall
 */

import java.util.*;


public class LAB211_Slot1_Exercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your content: ");
        Count count = new Count(sc.nextLine());

        System.out.println(count.wordCount());
        System.out.println(count.charCount());
    }
}
