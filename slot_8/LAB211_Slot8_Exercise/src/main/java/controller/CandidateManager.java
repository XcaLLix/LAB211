/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author xcall
 */
import database.*;
import model.*;
import util.Validation;
import java.util.List;

public class CandidateManager {
    private final DataCandidate data = new DataCandidateImpl();

    public void createCandidate(int type) {
        System.out.println("\n=== CREATE CANDIDATE  ===");
        String id = Validation.inputString("Enter ID: ");
        String f  = Validation.inputString("First name: ");
        String l  = Validation.inputString("Last name: ");
        int by    = Validation.inputBirthYear("Birth year: ");
        String ad = Validation.inputString("Address: ");
        String ph = Validation.inputPhone("Phone: ");
        String em = Validation.inputEmail("Email: ");

        try {
            switch (type) {
                case 0 -> {
                    int exp = Validation.inputInt("Years of experience (0 - 100): ", 0, 100);
                    String sk = Validation.inputString("Professional skill: ");
                    data.insert(new Experience(id, f, l, by, ad, ph, em, 0, exp, sk));
                }
                case 1 -> {
                    int gy = Validation.inputBirthYear("Graduation year: ");
                    String rk = Validation.inputRank("Graduation rank (Excellence/Good/Fair/Poor): ");
                    String ed = Validation.inputString("University: ");
                    data.insert(new Fresher(id, f, l, by, ad, ph, em, 1, gy, rk, ed));
                }
                case 2 -> {
                    String mj = Validation.inputString("Majors: ");
                    int sem   = Validation.inputInt("Semester: ", 1, 12);
                    String un = Validation.inputString("University: ");
                    data.insert(new Intern(id, f, l, by, ad, ph, em, 2, mj, sem, un));
                }
            }
            System.out.println("Saved to SQL Server.");
        } catch (Exception e) {
            System.out.println("Insert failed: " + e.getMessage());
        }
    }

    public void updateCandidate() {
        String id = Validation.inputString("\nEnter Candidate ID to update: ");
        try {
            var opt = data.findById(id);
            if (opt.isEmpty()) { System.out.println("Not found."); return; }
            Candidate c = opt.get();
            String f  = Validation.inputString("First name: ");
            String l  = Validation.inputString("Last name: ");
            int by    = Validation.inputBirthYear("Birth year: ");
            String ad = Validation.inputString("Address: ");
            String ph = Validation.inputPhone("Phone: ");
            String em = Validation.inputEmail("Email: ");

            if (c instanceof Experience e) {
                int exp = Validation.inputInt("Years of experience (0 - 100): ", 0, 100);
                String sk = Validation.inputString("Professional skill: ");
                c = new Experience(id, f, l, by, ad, ph, em, 0, exp, sk);
            } else if (c instanceof Fresher fr) {
                int gy = Validation.inputBirthYear("Graduation year: ");
                String rk = Validation.inputRank("Graduation rank: ");
                String ed = Validation.inputString("University: ");
                c = new Fresher(id, f, l, by, ad, ph, em, 1, gy, rk, ed);
            } else if (c instanceof Intern i) {
                String mj = Validation.inputString("Majors: ");
                int sem   = Validation.inputInt("Semester: ", 1, 12);
                String un = Validation.inputString("University: ");
                c = new Intern(id, f, l, by, ad, ph, em, 2, mj, sem, un);
            }
            System.out.println(data.update(c) ? "Updated." : "Update failed.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void deleteCandidate() {
        String id = Validation.inputString("\nEnter Candidate ID to delete: ");
        try {
            System.out.println(data.deleteById(id) ? "Deleted." : "Not found.");
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public void displayGroupedByType() {
        try {
            System.out.println("\nList of candidate:");
            print(0, "===========EXPERIENCE CANDIDATE============");
            print(1, "===========FRESHER CANDIDATE===============");
            print(2, "===========INTERN CANDIDATE================");
        } catch (Exception e) { System.out.println("Error: " + e.getMessage()); }
    }
    private void print(int type, String title) throws Exception {
    System.out.println(title);

    switch (type) {
        case 0 -> System.out.println(String.format("%-5s | %-15s | %-10s | %-20s | %-12s | %-25s | %-10s | %s",
                "ID","Name", "BirthYear", "Address", "Phone", "Email", "ExpYear", "ProSkill"));
        case 1 -> System.out.println(String.format("%-5s | %-15s | %-10s | %-20s | %-12s | %-25s | %-12s | %-10s | %s",
                "ID","Name", "BirthYear", "Address", "Phone", "Email", "GradYear", "Rank", "Education"));
        case 2 -> System.out.println(String.format("%-5s | %-15s | %-10s | %-20s | %-12s | %-25s | %-10s | %-10s | %s",
                "ID","Name", "BirthYear", "Address", "Phone", "Email", "Major", "Semester", "University"));
    }

    for (var c : data.findAllByType(type)) System.out.println(c);
}

    public void searchCandidate() {
        String name = Validation.inputString("\nEnter name: ");
        int type = Validation.inputInt("Type (0=Exp,1=Fresher,2=Intern): ", 0, 2);
        try { data.searchByNameAndType(name, type).forEach(System.out::println); }
        catch (Exception e) { System.out.println("Error " + e.getMessage()); }
    }
}