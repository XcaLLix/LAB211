/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot2_exercise2;

/**
 *
 * @author xcall
 */
public class Matrix {
    private  int rows;
    private  int cols;
    private double[][] a;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.a = new double[rows][cols];
    }

    public int rows() { return rows; }
    public int cols() { return cols; }
    public double get(int i, int j) { return a[i][j]; }
    public void set(int i, int j, double v) { a[i][j] = v; }

    
    public void input(String name) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                String prompt = String.format("Enter %s[%d][%d]: ", name, i + 1, j + 1);
                a[i][j] = Validator.readDouble(prompt);
            }
        }
    }

    
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("[" + fmt(a[i][j]) + "]");
            }
            System.out.println();
        }
    }

    private String fmt(double v) {
        String s = java.math.BigDecimal.valueOf(v).stripTrailingZeros().toPlainString();        
        return s.equals("-0") ? "0" : s;
    }

    // A + B
    public Matrix add(Matrix b) {
        Matrix r = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                r.a[i][j] = this.a[i][j] + b.a[i][j];
        return r;
    }

    // A - B
    public Matrix sub(Matrix b) {
        Matrix r = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                r.a[i][j] = this.a[i][j] - b.a[i][j];
        return r;
    }

    // A x B
    public Matrix mul(Matrix b) {
        Matrix r = new Matrix(rows, b.cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < b.cols; j++) {
                double sum = 0;
                for (int k = 0; k < cols; k++)
                    sum += this.a[i][k] * b.a[k][j];
                r.a[i][j] = sum;
            }
        }
        return r;
    }
}
