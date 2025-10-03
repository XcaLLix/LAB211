/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot4_exercise2;

/**
 *
 * @author xcall
 */
public class Teacher extends Person {
    private int yearsInProfession;
    private String contractType; // Long / Short
    private double salaryCoef;

    public Teacher() {
        super();
        this.yearsInProfession = 0;
        this.contractType = "";
        this.salaryCoef = 0;
    }

    @Override
    public void inputAll() {
        super.inputAll();
        this.yearsInProfession = Validator.readInt("Years in profession: ", 0, 150);
        this.contractType = Validator.readPattern("Contract type (Long/Short): ", "^(Long|Short)$");
        this.salaryCoef = Validator.readDouble("Salary coefficient: ", 0);
    }

    @Override
    public String toString() {
        return super.toString() + " - " + yearsInProfession + " - " + contractType + " - " + salaryCoef;
    }

    public int getYearsInProfession() { return yearsInProfession; }
}
