/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab211_slot3_exercise1;

/**
 *
 * @author xcall
 */
public class Main {

    public static void main(String[] args) {
        BubbleSort arr = new BubbleSort(Validator.inportNumber("Enter size of array:"),Validator.inportNumber("The maximum value of the array:"));
        System.out.println("The array: " + arr.Printarray());
        arr.Sort();
        System.out.println("The array after sorting: " + arr.Printarray());
    }
}
