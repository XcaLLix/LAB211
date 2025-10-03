/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot4_exercise2;

/**
 *
 * @author xcall
 */
import java.util.Scanner;
import java.util.Calendar;

public class Validator {
    private static final Scanner sc = new Scanner(System.in);

    public static String readPattern(String msg, String regex) {
        while (true) {
            System.out.print(msg);
            String s = sc.nextLine().trim();
            if (s.matches(regex)) return s;
            System.out.println("Data input is invalid");
        }
    }

    public static int readInt(String msg, int min, int max) {
        while (true) {
            try {
                System.out.print(msg);
                int x = Integer.parseInt(sc.nextLine().trim());
                if (x >= min && x <= max) return x;
            } catch (NumberFormatException ignored) {}
            System.out.println("Data input is invalid");
        }
    }

    public static double readDouble(String msg, double min) {
        while (true) {
            try {
                System.out.print(msg);
                double x = Double.parseDouble(sc.nextLine().trim());
                if (x >= min) return x;
            } catch (NumberFormatException ignored) {}
            System.out.println("Data input is invalid");
        }
    }

    public static int readYear(String msg) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return readInt(msg, 1900, currentYear - 1);
    }
}
