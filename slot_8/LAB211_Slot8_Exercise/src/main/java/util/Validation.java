/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author xcall
 */
import java.util.Scanner;
import java.util.regex.Pattern;
import java.time.Year;

public class Validation {
    private static final Scanner sc = new Scanner(System.in);

    public static String inputString(String msg) {
        System.out.print(msg);
        return sc.nextLine().trim();
    }

    public static int inputInt(String msg, int min, int max) {
        while (true) {
            try {
                System.out.print(msg);
                int n = Integer.parseInt(sc.nextLine());
                if (n < min || n > max) {
                    System.out.println("Value must be between " + min + " and " + max);
                } else return n;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again!");
            }
        }
    }

    public static String inputEmail(String msg) {
        while (true) {
            System.out.print(msg);
            String email = sc.nextLine().trim();
            if (checkEmail(email)) return email;
            System.out.println("Invalid email format (e.g. name@domain.com)");
        }
    }

    public static String inputPhone(String msg) {
        while (true) {
            System.out.print(msg);
            String phone = sc.nextLine().trim();
            if (checkPhone(phone)) return phone;
            System.out.println("Phone must contain at least 10 digits.");
        }
    }

    public static int inputBirthYear(String msg) {
        while (true) {
            int year = inputInt(msg, 1900, Year.now().getValue());
            if (checkYear(year)) return year;
            System.out.println("Invalid birth year.");
        }
    }

    public static String inputRank(String msg) {
        while (true) {
            System.out.print(msg);
            String rank = sc.nextLine().trim();
            if (checkRank(rank)) return rank;
            System.out.println("Rank must be: Excellence, Good, Fair, or Poor");
        }
    }
    
        // ====================================================================
    public static boolean checkEmail(String email) {
        return Pattern.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$", email);
    }

    public static boolean checkPhone(String phone) {
        return phone.matches("\\d{10,}");
    }

    public static boolean checkYear(int year) {
        int current = Year.now().getValue();
        return year >= 1900 && year <= current;
    }

    public static boolean checkRank(String rank) {
        return rank.equalsIgnoreCase("Excellence") ||
               rank.equalsIgnoreCase("Good") ||
               rank.equalsIgnoreCase("Fair") ||
               rank.equalsIgnoreCase("Poor");
    }

    
}
