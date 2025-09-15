/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab211_slot1_exercise2;

/**
 *
 * @author xcall
 */



public class Main  {
    public static void main(String[] args) {

        LinearSearch arr = new LinearSearch(Validator.inportNumber("Enter size of array:"),Validator.inportNumber("The maximum value of the array:"));
        System.out.println("The array: " + arr.toString());
        int rs = arr.indexOf(Validator.inportNumber("Enter number to find:"));
        if (rs != -1) {
            System.out.println("Element found  at index: " + rs);
        } else {
            System.out.println("Element not found in array.");
        }
    }
}