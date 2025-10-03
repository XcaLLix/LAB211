/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot4_exercise2;

/**
 *
 * @author xcall
 */
import java.util.*;

public class Menu {
    private final List<Teacher> teachers = new ArrayList<>();
    private final List<Student> students = new ArrayList<>();
    
    public void run() {
        while (true) {
            System.out.println("*** Information Management ***");
            System.out.println("1. Teacher\n2. Student\n3. Person\n4. Exit");
            int choice = Validator.readInt("You choose: ", 1, 4);

            switch (choice) {
                case 1 -> teacherMenu();
                case 2 -> studentMenu();
                case 3 -> personMenu();
                case 4 -> { System.out.println("BYE AND SEE YOU NEXT TIME"); return; }
            }
        }
    }

    private void teacherMenu() {
        while (true) {
            System.out.println("*** Teacher Management ***");
            System.out.println("1. Input\n2. Print\n3. Exit");
            int ch = Validator.readInt("You choose: ", 1, 3);
            switch (ch) {
                case 1 -> {
                    Teacher t = new Teacher();
                    t.inputAll();
                    teachers.add(t);
                }
                case 2 -> {
                    teachers.sort(Comparator.comparingInt(Teacher::getYearsInProfession).reversed());
                    for (Teacher t : teachers) {
                        System.out.println(t);
                    }
                    
                }
                default -> {
                    return;
                }
            }
        }
    }

    private void studentMenu() {
        while (true) {
            System.out.println("*** Student Management ***");
            System.out.println("1. Input\n2. Print\n3. Exit");
            int ch = Validator.readInt("You choose: ", 1, 3);
            switch (ch) {
                case 1 -> {
                    Student s = new Student();
                    s.inputAll();
                    students.add(s);
                }
                case 2 ->{
                    students.sort(Comparator.comparingInt(Student::getAdmissionYear));
                     for (Student s : students) {
                        System.out.println(s);
                    }
                            
                }
                default -> {
                    return;
                }
            }
        }
    }

    private void personMenu() {
        while (true) {
            System.out.println("*** Person Management ***");
            System.out.println("1. Search\n2. Print all\n3. Exit");
            int ch = Validator.readInt("You choose: ", 1, 3);
            switch (ch) {
                case 1 -> {
                    String name = Validator.readPattern("Name: ", "^[A-Za-z ]+$");
                    boolean found = false;
                    for (Person p : getAllPersons()) {
                        if (p.fullName.contains(name)) {
                            System.out.println(p);
                            found = true;
                        }
                    }   if (!found) System.out.println("Result: not found");
                }
                case 2 -> {
                    List<Person> list = getAllPersons();
                    list.sort(Comparator.comparingInt(Person::getYearOfBirth).reversed());
                    for (Person p : list) {
                        System.out.println(p);
                    }
                }
                default -> {
                    return;
                }
            }
        }
    }

    private List<Person> getAllPersons() {
        List<Person> all = new ArrayList<>();
        all.addAll(teachers);
        all.addAll(students);
        return all;
    }
}

