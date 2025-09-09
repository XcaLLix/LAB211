/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab211_slot1_exercise1;

/**
 *
 * @author xcall
 */

import java.util.*;
public class LAB211_Slot1_Exercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your content: ");
        String input = sc.nextLine();
        
        // ---- Đếm từ ----
        StringTokenizer tokenizer = new StringTokenizer(input);
        
        Map<String, Integer> wordCount = new LinkedHashMap<>();
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // ---- Đếm ký tự ----
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            if (c != ' ') { 
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println(wordCount);
        System.out.println(charCount);
    }
}
