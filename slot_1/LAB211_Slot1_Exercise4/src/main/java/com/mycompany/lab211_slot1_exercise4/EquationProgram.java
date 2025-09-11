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
    private static final float EPS = 1e-6f;


    public List<Float> calculateEquation(float a, float b) {
        if (Math.abs(a) < EPS && Math.abs(b) < EPS) {
            return new ArrayList<>();  
        }
        if (Math.abs(a) < EPS) {
            return null;               
        }
        List<Float> res = new ArrayList<>();
        res.add(-b / a);
        return res;
    }


    public List<Float> calculateQuadraticEquation(float a, float b, float c) {
        if (Math.abs(a) < EPS) { 
            return calculateEquation(b, c);
        }
        float delta = b * b - 4 * a * c;
        if (delta < -EPS) {
            return null;
        } else if (Math.abs(delta) < EPS) {
            List<Float> res = new ArrayList<>();
            res.add(-b / (2 * a));
            return res;
        } else {
            float sqrtD = (float) Math.sqrt(delta);
            List<Float> res = new ArrayList<>();
            res.add((-b + sqrtD) / (2 * a));
            res.add((-b - sqrtD) / (2 * a));
            return res;
        }
    }
}

