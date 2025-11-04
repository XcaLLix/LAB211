/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author dinhh
 */
public abstract class Cube extends ThreeDimensionalShape{
    public double length;

    public Cube(double length) {
        this.length = length;
    }


    @Override
    public double getArea() {      
        return 6 * length * length;
    }
    
    @Override
    public double getVolume() {
        return length * length * length;
    }
    
    @Override
    public String toString() {
        return "do dai hinh lap phuong la = " + length;
    }
}
