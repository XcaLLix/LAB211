/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab211_slot1_exercise3;

/**
 *
 * @author xcall
 */
public class LAB211_Slot1_Exercise3 {
    public static void main(String[] args) {
        System.out.println("=== Change Base Number System (2, 10, 16) ===");
        Menu ui = new Menu();

            int inputBase = ui.chooseBase("Choose INPUT base:");
            int outputBase = ui.chooseBase("Choose OUTPUT base:");
            String value = ui.inputValue(inputBase);

            NumberSystemConverter converter = new NumberSystemConverter(inputBase, outputBase, value);

            if (!converter.isValid()) {
                System.out.println("Invalid number for base " + inputBase + "\n");
            } else {
                System.out.println("Result: " + converter.convert() + "\n");
            }


        System.out.println("Program ended.");
    }
}
