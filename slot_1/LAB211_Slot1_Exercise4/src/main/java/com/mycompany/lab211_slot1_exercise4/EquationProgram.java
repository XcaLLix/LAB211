/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot1_exercise4;

/**
 *
 * @author xcall
 */
import java.util.ArrayList;
import java.util.List;

public class EquationProgram {
    private float a;
    private float b;
    private float c;   

    
    public EquationProgram(float a, float b) {
        this.a = a;
        this.b = b;
        this.c = 0;
    }

    public EquationProgram(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
  
    // Giải phương trình bậc nhất ax + b = 0
    public List<Float> calculateEquation() {
        if (a == 0 && b == 0) return new ArrayList<>(); // vô số nghiệm
        if (a == 0) return null;                        // vô nghiệm
        List<Float> res = new ArrayList<>();
        res.add(-b / a);
        return res;
    }

    // Giải phương trình bậc hai ax^2 + bx + c = 0
    public List<Float> calculateQuadraticEquation() {
        if (a == 0) {
            EquationProgram linear = new EquationProgram(b, c);
            return linear.calculateEquation();
        }
        float delta = b*b - 4*a*c;
        if (delta < 0) return null;
        List<Float> res = new ArrayList<>();
        if (delta == 0) {
            res.add(-b / (2*a));
        } else {
            float s = (float)Math.sqrt(delta);
            res.add((-b + s) / (2*a));
            res.add((-b - s) / (2*a));
        }
        return res;
    }

    // ==== Kiểm tra số  ====
    public boolean isEven(float n) { return n % 2 == 0; }
    public boolean isOdd(float n)  { return n % 2 != 0; }
    public boolean isSquare(float n) {
        if (n < 0) return false;
        int r = (int)Math.sqrt(n);
        return r*r == n;
    }

    // In kết quả phân loại 
        public void reportClassify() {
        System.out.print("Even number(s): ");
        if (isEven(a)) System.out.print(a + ", ");
        if (isEven(b)) System.out.print(b + ", ");
        if (isEven(c)) System.out.print(c + ", ");
        System.out.println();

        System.out.print("Odd number(s): ");
        if (isOdd(a)) System.out.print(a + ", ");
        if (isOdd(b)) System.out.print(b + ", ");
        if (isOdd(c)) System.out.print(c + ", ");
        System.out.println();

        System.out.print("Perfect square number(s): ");
        if (isSquare(a)) System.out.print(a + ", ");
        if (isSquare(b)) System.out.print(b + ", ");
        if (isSquare(c)) System.out.print(c + ", ");
        System.out.println();
    }
}
