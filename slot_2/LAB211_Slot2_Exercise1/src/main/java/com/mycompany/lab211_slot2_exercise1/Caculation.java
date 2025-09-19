/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot2_exercise1;

/**
 *
 * @author xcall
 */
public class Caculation {
    
    private double memory;

    public Caculation(double memory) {
        this.memory = memory;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }
    
    
    public void caculate(String op, double numble){
        switch (op){
            case "+" -> memory += numble;
            case "-" -> memory -= numble;
            case "*" -> memory *= numble;
            case "/" -> memory /= numble;
            case "^" -> memory = Math.pow(memory,numble);
            default  -> {
                System.out.println("Please input (+, -, *, /, ^)");
            }
            
        }
    }
    
}
