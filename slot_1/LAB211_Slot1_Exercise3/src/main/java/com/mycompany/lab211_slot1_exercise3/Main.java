/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab211_slot1_exercise3;

/**
 *
 * @author xcall
 */
public class Main {
    public static void main(String[] args) {
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

    }
}
