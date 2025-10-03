/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot4_exercise1;

/**
 *
 * @author xcall
 */

public class Menu {

    public void run() {
        StudentManagement student = new StudentManagement();
        while (true) {
            System.out.println("========= Student =========");
            System.out.println("1. Creative Student");
            System.out.println("2. Find Student");
            System.out.println("3. Sort Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Report");
            System.out.println("0. Exit");
            System.out.println("===========================");
            int choice = Validator.readInt("Your choice: ");
            
            switch (choice){
                case 1 -> {
                    while (true){
                        String Id = Validator.readString("Enter ID: ");
                        String Name = Validator.readString("Enter Name: ");
                        String Sem = Validator.readString("Enter Semester: ");
                        String Course = Validator.readString("Enter Course: ");
                        Student stu = new Student(Id,Name,Sem,Course);
                        if (student.addStudent(stu)) break;
                        System.out.println("Add Student failse fail. Try again!!!");
                    } 
                    
                }
                case 2 ->{
                    String Id = Validator.readString("Enter ID: ");
                    student.findStudent(Id);
                    
                }
                case 3 ->{
                    student.sortStudent();
                }
                case 4 ->{
                    String Id = Validator.readString("Enter ID: ");
                    String Name = Validator.readString("Enter Name: ");
                    String Sem = Validator.readString("Enter Semester: ");
                    String Course = Validator.readString("Enter Course: ");
                    Student stu = new Student(Id,Name,Sem,Course);
                    if (!student.updateStudent(stu)) System.out.println("Error!!! Do not find information.");
                }
                case 5->{
                    String Id = Validator.readString("Enter ID: ");
                    String Name = Validator.readString("Enter Name: ");
                    String Sem = Validator.readString("Enter Semester: ");
                    String Course = Validator.readString("Enter Course: ");
                    Student stu = new Student(Id,Name,Sem,Course);
                    student.deleteStudent(stu);
                }
                case 6 ->{
                    student.reportStudent();
                }
                case 0 ->{ return;
                    
                }
                default -> System.out.println("Invali choice. Try again!!!");
                
            }
            
            
        }
    }

}

