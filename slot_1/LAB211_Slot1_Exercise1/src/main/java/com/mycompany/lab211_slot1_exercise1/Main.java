/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab211_slot1_exercise1;

/**
 *
 * @author xcall
 */



public class Main {

    public static void main(String[] args) {
        Count count = new Count(Validator.readString("Enter your content: "));
        System.out.println(count.wordCount());
        System.out.println(count.charCount());
    }
}
