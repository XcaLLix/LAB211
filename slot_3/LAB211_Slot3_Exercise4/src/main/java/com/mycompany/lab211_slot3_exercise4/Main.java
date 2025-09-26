/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab211_slot3_exercise4;

/**
 *
 * @author xcall
 */
public class Main {

        public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();   

        System.out.println("Get top: " + stack.get()); 
        System.out.println("Pop: " + stack.pop());     
        stack.printStack();   
        stack.push(40);
        stack.printStack();   
    }
}
