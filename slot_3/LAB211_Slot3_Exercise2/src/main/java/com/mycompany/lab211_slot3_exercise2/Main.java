/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab211_slot3_exercise2;

/**
 *
 * @author xcall
 */
public class Main {

    public static void main(String[] args) {
        QuickSort arr = new QuickSort(Validator.inportNumber("Enter size of array:"),Validator.inportNumber("The maximum value of the array:"));
        System.out.println("The array: " + arr.Printarray());
        arr.Sort(0,arr.getArr().length - 1);
        System.out.println("The array after sorting: " + arr.Printarray());
    }
}

