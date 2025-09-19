/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot2_exercise1;

/**
 *
 * @author xcall
 */
public class BMICaculation {
    private double weight;
    private double height;

    public BMICaculation(double weight, double height) {
        this.weight = weight;
        this.height = height/100;
    }
    
    public double BMI(){
        return weight / (height *height);
    }
    
    public String BMIStatus(double bmi) {
        if (bmi < 19) return "UNDER-STANDARD";
            else if (bmi < 25) return "STANDARD";
                else if (bmi < 30) return "OVERWEIGHT";
                    else if (bmi <= 40) return "FAT - SHOULD LOSE WEIGHT";
                        else return "VERY FAT - SHOULD LOSE WEIGHT IMMEDIATELY";
    }

    
}
