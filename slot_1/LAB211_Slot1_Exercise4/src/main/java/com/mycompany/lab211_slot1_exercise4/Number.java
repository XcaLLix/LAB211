/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot1_exercise4;

/**
 *
 * @author xcall
 */
import java.util.ArrayList;
import java.util.List;

public class Number {
    private static final float EPS = 1e-6f;

    public static boolean floatCheckIn(String floatString) {
        if (floatString == null || floatString.trim().isEmpty()) return false;
        try {
            Float.parseFloat(floatString.trim());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public static boolean isInteger(float x) {
        return Math.abs(x - Math.round(x)) < EPS && !Float.isInfinite(x) && !Float.isNaN(x);
    }

    public static boolean isOdd(float x) {
        return isInteger(x) && (Math.round(x) % 2 != 0);
    }

    public static boolean isEven(float x) {
        return isInteger(x) && (Math.round(x) % 2 == 0);
    }

    public static boolean isPerfectSquare(float x) {
        if (!isInteger(x) || x < 0) return false;
        long n = Math.round(x);
        long r = Math.round(Math.sqrt(n));
        return r * r == n;
    }

    public static List<Float> filterOdds(float... arr) {
        List<Float> res = new ArrayList<>();
        for (float v : arr) if (isOdd(v)) res.add(v);
        return res;
    }
    public static List<Float> filterEvens(float... arr) {
        List<Float> res = new ArrayList<>();
        for (float v : arr) if (isEven(v)) res.add(v);
        return res;
    }
    public static List<Float> filterSquares(float... arr) {
        List<Float> res = new ArrayList<>();
        for (float v : arr) if (isPerfectSquare(v)) res.add(v);
        return res;
    }


    public static String listToString(List<Float> list) {
        if (list == null || list.isEmpty()) return "(none)";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(String.format("%.1f", list.get(i)));
            if (i + 1 < list.size()) sb.append(", ");
        }
        return sb.toString();
    }
}

