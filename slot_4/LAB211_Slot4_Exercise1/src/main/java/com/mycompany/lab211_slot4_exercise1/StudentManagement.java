/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot4_exercise1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author xcall
 */
public class StudentManagement {
    
    private List<Student> studentList = new ArrayList();
    
    public boolean addStudent(Student student){
        for (Student st : studentList){
            if (checkStudent(st,student)){
                System.out.println("The information is duplicated.");
                return false;
            }
        }
        return studentList.add(student);
    }
    
    public void findStudent(String id){
        boolean kt = false;
        //
        for (Student st: studentList)
            if (id.equalsIgnoreCase(st.getId())){
                System.out.println(st);
                kt = true;
            }
        if (!kt) System.out.println("Do not find id.");
    }
    
    public void showStudent(){
        for (Student st :studentList){
            System.out.println(st.toString());
        }
    }
    
    public void deleteStudent(Student student){
        for (Student st : studentList)
            if (checkStudent(student,st)){
                studentList.remove(st);
            }
    }
    

    
    public boolean updateStudent(Student student){

        for (Student st : studentList)
            if (checkStudent(st,student)){
                boolean kt = false;
                while (!kt){
                    String Id = Validator.readString("Enter ID: ");
                    String Name = Validator.readString("Enter Name: ");
                    String Sem = Validator.readString("Enter Semester: ");
                    String Course = Validator.readString("Enter Course: ");
                    Student upStudent = new Student(Id,Name,Sem,Course);
                    kt =true;
                    for (Student stu : studentList) 
                        if (checkStudent(stu,upStudent)) kt = false;
                    if (kt){ st.setId(Id); st.setName(Name); st.setSemester(Sem); st.setCourse(Course);}
                    return true;
                }
            }
        return false;
    }
    
    public void sortStudent(){
        studentList.sort(Comparator.comparing(Student::getId));
        showStudent();
    }
    
    public void reportStudent(){
        Map<String,Integer> report = new HashMap<>();
        
        for (Student st: studentList){
            String key = st.getId()+ " | " + st.getName() + " | " + st.getCourse();
            report.put(key,report.getOrDefault(key,0)+1);
        }
        
        for (Map.Entry<String,Integer> st: report.entrySet() ){
        System.out.println(st.getKey()+" | "+st.getValue());
    }
    }
        
    public boolean checkStudent(Student student, Student st){
            if (student.getId().equalsIgnoreCase(st.getId()) 
                && student.getName().equalsIgnoreCase(st.getName())             
                && student.getSemester().equalsIgnoreCase(st.getSemester()) 
                && student.getCourse().equalsIgnoreCase(st.getCourse()))return true;
        return false;
    }
}
