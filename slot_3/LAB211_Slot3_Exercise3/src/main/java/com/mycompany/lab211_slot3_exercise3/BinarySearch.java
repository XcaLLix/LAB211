/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot3_exercise3;

import java.util.Arrays;
//import java.util.HashSet;
import java.util.Random;
//import java.util.Set;

/**
 *
 * @author xcall
 */
public class BinarySearch {
    int[] arr;


    public BinarySearch(int n, int x) {
        arr = new int[n];
        Random rd = new Random();
//       Set<Integer> kt = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int val = rd.nextInt(x) + 1; 
//            while (!kt.add(val)){
//                val = rd.nextInt(x) + 1;
//            }
            arr[i] = val;
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
    
    
    public int indexOf(int target, int left, int right) {
    if (left > right) return -1;
    
    int mid = (left + right) / 2;
    if (arr[mid] == target) return mid;
    
    if (arr[mid] > target)
        return indexOf(target, left, mid - 1);
    else
        return indexOf(target, mid + 1, right);
}

    public String printArray() {
        return Arrays.toString(arr);
    }
}
