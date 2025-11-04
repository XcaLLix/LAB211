/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author xcall
 */
public class Experience extends Candidate {
    private int expInYear;
    private String proSkill;

    public Experience(String id, String fName, String lName, int birth, String address,
                      String phone, String email, int type, int expInYear, String proSkill) {
        super(id, fName, lName, birth, address, phone, email, type);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
    @Override
public String toString() {
    return super.toString() + String.format("| %-10s | %s", expInYear, proSkill);
}
    
    
    
}