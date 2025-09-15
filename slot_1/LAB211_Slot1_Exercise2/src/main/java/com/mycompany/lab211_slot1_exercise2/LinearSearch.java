/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot1_exercise2;

/**
 *
 * @author xcall
 */
import java.util.Arrays;
import java.util.Random;

public class LinearSearch {
    int[] data;

    // Khởi tạo mảng với kích thước n, sinh số random
    public LinearSearch(int n, int x) {
        data = new int[n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            data[i] = rd.nextInt(x) + 1; 
        }
    }

    public int indexOf(int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return Arrays.toString(data);
    }
}
