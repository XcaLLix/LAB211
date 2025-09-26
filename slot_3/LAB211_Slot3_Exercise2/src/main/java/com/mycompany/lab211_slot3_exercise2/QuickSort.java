/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot3_exercise2;

/**
 *
 * @author xcall
 */
import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    
    int[] arr;
    
    public QuickSort(int n, int x) {
        arr = new int[n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(x) + 1; 
        }
    }

    public int[] getArr() {
        return arr;
    }
    
    
    public void Sort(int left, int right) {
        int i = left, j = right;
        
        int pivot = arr[(left + right) / 2]; 

        while (i <= j) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (left < j) Sort(left, j);
        if (i < right) Sort(i, right);
    }

        public String Printarray() {
        return Arrays.toString(arr);
    }
    
}