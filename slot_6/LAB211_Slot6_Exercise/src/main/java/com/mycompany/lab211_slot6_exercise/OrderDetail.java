/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot6_exercise;

/**
 *
 * @author xcall
 */
public class OrderDetail {
    private Fruit fruit;
    private int quantity;
    private double amuont;

    public OrderDetail(Fruit fruit, int quantity) {
        this.fruit = fruit;
        this.quantity = quantity;
        this.amuont = fruit.getPrice() * quantity;
    }
    
    

    public Fruit getFruit() {
        return fruit;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getAmuont() {
        return amuont;
    }

    @Override
    public String toString() {
        return String.format("| %s | %4d | %6.2f |",fruit,quantity,amuont);
    }
}
