/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author xcall
 */
import controller.CandidateManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CandidateManager manager = new CandidateManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== CANDIDATE MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Experience");
            System.out.println("2. Create Fresher");
            System.out.println("3. Create Internship");
            System.out.println("4. List all (grouped by type)");
            System.out.println("5. Search");
            System.out.println("6. Update");
            System.out.println("7. Delete");
            System.out.println("8. Exit");
            System.out.print("Choose: ");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> manager.createCandidate(0);
                case 2 -> manager.createCandidate(1);
                case 3 -> manager.createCandidate(2);
                case 4 -> manager.displayGroupedByType();
                case 5 -> manager.searchCandidate();
                case 6 -> manager.updateCandidate();
                case 7 -> manager.deleteCandidate();
                case 8 -> { System.out.println("Goodbye!"); return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}