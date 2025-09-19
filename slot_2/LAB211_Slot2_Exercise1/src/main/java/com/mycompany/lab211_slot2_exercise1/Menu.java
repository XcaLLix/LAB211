/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot2_exercise1;

/**
 *
 * @author xcall
 */
public class Menu {
    
    public void run() {
        
        while(true){
            System.out.println("========== Caculator Program ==========");
            System.out.println("1. Normal Caculator");
            System.out.println("2. BMI Caculator");
            System.out.println("3. Exit");
            
            int choice = Validator.readInt("Choice: ");
            
            switch (choice){
                case 1 -> {
                    double num1 = Validator.readDouble("Enter number: ");
                    Caculation caculation = new Caculation(num1);
        
        
                    while (true){
                        String op = Validator.readOperator("Enter operator: ");
                        if (op.equals("=")){
                            System.out.println("Result is: "+ caculation.getMemory());
                            break;
                        }
                        double num2 = Validator.readDouble("Entet number: ");
                        caculation.caculate(op, num2);
                        System.out.println("Memory: "+ caculation.getMemory());
                    }   
                }
                case 2 -> {
                    double he = Validator.readDoubleBMI("Enter Weight(kg): ");
                    double we = Validator.readDoubleBMI("Enter Height(cm): ");
                    BMICaculation BMIcaculator = new BMICaculation(he,we);
                    System.out.println("BMI Number: " + BMIcaculator.BMI() );
                    System.out.println("BMI Status: " + BMIcaculator.BMIStatus(BMIcaculator.BMI()));
                }
                case 3 -> {
                    return;
                }
                default -> System.out.println("Invalid choice!!!");
            }
            
        }
        
    }
    
}
