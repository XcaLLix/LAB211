/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot1_exercise1;

/**
 *
 * @author xcall
 */
import java.util.*;

public class Count {
    
    String x;
    
    public Count(String x){
        this.x = x;
    }
    
    public Map wordCount() {
        StringTokenizer tokenizer = new StringTokenizer(x);
        
        Map<String, Integer> wordCount = new LinkedHashMap<>();
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        return wordCount;
    }
    
    public Map charCount() {
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char c : x.toCharArray()) {
            if (c != ' ') { 
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }
        return charCount;
    }
    
}
