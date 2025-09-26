/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab211_slot3_exercise3;

/**
 *
 * @author xcall
 */
public class Main  {
    public static void main(String[] args) {

        BinarySearch arr = new BinarySearch(Validator.inportNumber("Enter size of array:"),Validator.inportNumber("The maximum value of the array:"));
        arr.Sort(0, arr.getArr().length -1);
        System.out.println("Sorted array: " + arr.printArray());
        int target = Validator.inportNumber("Enter number to find:");
        int rs = arr.indexOf(target,0,arr.getArr().length-1);
        if (rs != -1) {
            System.out.println("found " + target + "  at index: " + rs);
        } else {
            System.out.println("Element not found in array.");
        }
    }
}
