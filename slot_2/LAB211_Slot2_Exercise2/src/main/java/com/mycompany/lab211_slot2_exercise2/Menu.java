/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot2_exercise2;

/**
 *
 * @author xcall
 */
public class Menu {

    public void run() {
        while (true) {
            System.out.println("=======Calculator program=======");
            System.out.println("1. Addition Matrix");
            System.out.println("2. Subtraction Matrix");
            System.out.println("3. Multiplication Matrix");
            System.out.println("4. Quit");
            int choice = Validator.readMenuChoice("Your choice: ");

            switch (choice) {
                case 1 -> doAddition();
                case 2 -> doSubtraction();
                case 3 -> doMultiplication();
                case 4 -> { System.out.println("Exit program."); return; }
            }
            System.out.println();
        }
    }

    private void doAddition() {
        System.out.println("------- Addition -------");
        int r1 = Validator.readPositiveInt("Enter Row Matrix 1: ");
        int c1 = Validator.readPositiveInt("Enter Column Matrix 1: ");
        Matrix m1 = new Matrix(r1, c1);
        m1.input("Matrix1");

        int r2 = Validator.readPositiveInt("Enter Row Matrix 2: ");
        int c2 = Validator.readPositiveInt("Enter Column Matrix 2: ");
        if (r1 != r2 || c1 != c2) {
            System.out.println("Two matrices must have the same size.");
            return;
        }
        Matrix m2 = new Matrix(r2, c2);
        m2.input("Matrix2");

        Matrix result = m1.add(m2);

        System.out.println("-------- Result --------");
        m1.printMatrix();
        System.out.println("+");
        m2.printMatrix();
        System.out.println("=");
        result.printMatrix();
    }

    private void doSubtraction() {
        System.out.println("------- Subtraction -------");
        int r1 = Validator.readPositiveInt("Enter Row Matrix 1: ");
        int c1 = Validator.readPositiveInt("Enter Column Matrix 1: ");
        Matrix m1 = new Matrix(r1, c1);
        m1.input("Matrix1");

        int r2 = Validator.readPositiveInt("Enter Row Matrix 2: ");
        int c2 = Validator.readPositiveInt("Enter Column Matrix 2: ");
        if (r1 != r2 || c1 != c2) {
            System.out.println("Two matrices must have the same size.");
            return;
        }
        Matrix m2 = new Matrix(r2, c2);
        m2.input("Matrix2");

        Matrix result = m1.sub(m2);

        System.out.println("-------- Result --------");
        m1.printMatrix();
        System.out.println("-");
        m2.printMatrix();
        System.out.println("=");
        result.printMatrix();
    }

    private void doMultiplication() {
        System.out.println("----- Multiplication -----");
        int r1 = Validator.readPositiveInt("Enter Row Matrix 1: ");
        int c1 = Validator.readPositiveInt("Enter Column Matrix 1: ");
        Matrix m1 = new Matrix(r1, c1);
        m1.input("Matrix1");

        int r2 = Validator.readPositiveInt("Enter Row Matrix 2: ");
        int c2 = Validator.readPositiveInt("Enter Column Matrix 2: ");
        if (c1 != r2) {
            System.out.println("Column Matrix 1 must equal Row Matrix 2");
            return;
        }
        Matrix m2 = new Matrix(r2, c2);
        m2.input("Matrix2");

        Matrix result = m1.mul(m2);

        System.out.println("-------- Result --------");
        m1.printMatrix();
        System.out.println("*");
        m2.printMatrix();
        System.out.println("=");
        result.printMatrix();
    }
}
