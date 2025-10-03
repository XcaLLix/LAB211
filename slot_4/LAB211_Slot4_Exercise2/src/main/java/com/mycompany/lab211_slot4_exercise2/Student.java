/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot4_exercise2;

/**
 *
 * @author xcall
 */
public class Student extends Person {
    private int admissionYear;
    private int englishScore;

    public Student() {
        super();
        this.admissionYear = 0;
        this.englishScore = 0;
    }

    @Override
    public void inputAll() {
        super.inputAll();
        this.admissionYear = Validator.readYear("Admission year: ");
        this.englishScore = Validator.readInt("Entrance English score: ", 0, 100);
    }

    @Override
    public String toString() {
        return super.toString() + " - " + admissionYear + " - " + englishScore;
    }

    public int getAdmissionYear() { return admissionYear; }
}

