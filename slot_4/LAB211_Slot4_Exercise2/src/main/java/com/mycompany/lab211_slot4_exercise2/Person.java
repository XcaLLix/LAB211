/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot4_exercise2;

/**
 *
 * @author xcall
 */
public class Person {
    protected String id;
    protected String fullName;
    protected String phone;
    protected int yearOfBirth;
    protected String major;

    public Person() {
        this.id = "";
        this.fullName = "";
        this.phone = "";
        this.yearOfBirth = 0;
        this.major = "";
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
    
    

    public void inputAll() {
        this.id = Validator.readPattern("ID (6 digits): ", "\\d{6}");
        this.fullName = Validator.readPattern("Fullname: ", "^[A-Za-z ]+$");
        this.phone = Validator.readPattern("Phone (12 digits): ", "\\d{12}");
        this.yearOfBirth = Validator.readYear("Year of birth: ");
        this.major = Validator.readPattern("Major (<=30 chars): ", "^.{1,30}$");
    }

    public String toString() {
        return id + " - " + fullName + " - " + phone + " - " + yearOfBirth + " - " + major;
    }
}

