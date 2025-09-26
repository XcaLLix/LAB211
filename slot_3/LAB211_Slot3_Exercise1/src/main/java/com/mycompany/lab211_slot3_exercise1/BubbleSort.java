/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot3_exercise1;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author xcall
 */
public class BubbleSort {
    
    int[] arr;
    
    public BubbleSort(int n, int x) {
        arr = new int[n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(x) + 1; 
        }
    }
    
    public void Sort(){
        for (int i=0; i< arr.length -1; i++)
        { 
            boolean swap = false;
            for (int j=0; j < arr.length -i -1; j++)
                if (arr[j]>arr[j+1]){
                    swap =true;
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            if (!swap) return;
        }
    }
    
        public String Printarray() {
        return Arrays.toString(arr);
    }
    
}
