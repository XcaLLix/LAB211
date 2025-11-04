/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author xcall
 */
public class Intern extends Candidate {
    private String majors;
    private int semester;
    private String universityName;

    public Intern(String id, String fName, String lName, int birth, String address,
                  String phone, String email, int type, String majors,
                  int semester, String universityName) {
        super(id, fName, lName, birth, address, phone, email, type);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public int getSemester() {
        return semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    
    
    @Override
public String toString() {
    return super.toString() + String.format("| %-10s | %-10s | %s",
            majors, semester, universityName);
}

    
}