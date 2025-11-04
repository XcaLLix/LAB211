/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author dinhh
 */
public class Square extends TwoDimensionalShape{
    // canh
    private double side;

    public Square(double side) {
        this.side = side;
    }
    
    @Override
    public double getArea(){
        return side * side;
    }
    
       @Override                                                           
    public String toString() {
        return "Ban Kinh Hinh vuong La : " + side;
    }
}
