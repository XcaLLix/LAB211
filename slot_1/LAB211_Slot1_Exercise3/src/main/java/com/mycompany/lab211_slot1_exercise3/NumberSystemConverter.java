/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot1_exercise3;

/**
 *
 * @author xcall
 */
import java.math.BigInteger;

public class NumberSystemConverter {
    private int inputBase;
    private int outputBase;
    private String value;

    public NumberSystemConverter(int inputBase, int outputBase, String value) {
        this.inputBase = inputBase;
        this.outputBase = outputBase;
        this.value = value;
    }

    public boolean isValid() {
        String sign = "[+-]?";
        String pattern;
        switch (inputBase) {
            case 2  -> pattern = sign + "[01]+";
            case 10 -> pattern = sign + "\\d+";
            case 16 -> pattern = sign + "[0-9a-fA-F]+";
            default -> { return false; }
        }
        return value.matches(pattern);
    }

    public String convert() {
        BigInteger bi = new BigInteger(value, inputBase);
        String out = bi.toString(outputBase);
        return (outputBase == 16) ? out.toUpperCase() : out;
    }
}
