/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211_slot6_exercise;

import java.util.*;

/**
 *
 * @author xcall
 */
public class FruitShop {
    private List<Fruit> fruits = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    public void run() {
        addFruits();
        showFruits();
        shopping();
        viewOders();
        
    }
    
    private void addFruits(){
        fruits.add(new Fruit("01", "banana", 3, 12, "VN"));
        fruits.add(new Fruit("02", "orange", 3.5, 120, "VN"));
        fruits.add(new Fruit("03", "apple", 1.5, 100, "VN"));
        
    }
    private void showFruits() {
        System.out.println("| Item | Fruit Name | Origin | Price | Quantity |");
        int i=1;
        for (Fruit f: fruits){
            System.out.println(f.toString());
        }
    }
    
    
    private void shopping(){
            Order order1 = new Order("hung");
            List<OrderDetail> bag = new ArrayList<>();

            Fruit item1 = fruits.get(1);
            int qty1 = 10;
            item1.setQuantity(item1.getQuantity() - qty1);
            bag.add(new OrderDetail(item1, qty1));
            Fruit item2 = fruits.get(2);
            int qty2 = 10;
            item2.setQuantity(item2.getQuantity() - qty2);
            bag.add(new OrderDetail(item2, qty2));
            for(OrderDetail od : bag){
                order1.addDetail(od);
            }
            orders.add(order1);       
    }
    
    private void viewOders(){
        System.out.println("danh sach chi tiet mua hang: ");
        for (Order o :orders){
            System.out.println(o);
        }
    }
}
