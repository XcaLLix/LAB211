/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot3_exercise4;

/**
 *
 * @author xcall
 */
import java.util.ArrayList;

public class Stack{
    private ArrayList<Integer> stack;

    public Stack() {
        stack = new ArrayList<>();
    }
    public void push(int value) {
        stack.add(value);
    }
    
    public Integer pop() {
        if (stack.isEmpty()) return null;
        return stack.remove(stack.size() - 1);
    }

    public Integer get() {
        if (stack.isEmpty())return null;

        return stack.get(stack.size() - 1);
    }


    public void printStack() {
        System.out.println("Stack: " + stack);
    }
    
}