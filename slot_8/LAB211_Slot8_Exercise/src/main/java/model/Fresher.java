/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author xcall
 */
public class Fresher extends Candidate {
    private int graduationDate;
    private String graduationRank;
    private String education;

    public Fresher(String id, String fName, String lName, int birth, String address,
                   String phone, String email, int type, int graduationDate,
                   String graduationRank, String education) {
        super(id, fName, lName, birth, address, phone, email, type);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public void setEducation(String education) {
        this.education = education;
    }
    
    @Override
public String toString() {
    return super.toString() + String.format(" | %-12s | %-10s | %s",
            graduationDate, graduationRank, education);
}
}