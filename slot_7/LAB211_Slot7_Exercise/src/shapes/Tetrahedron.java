/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author dinhh
 */
public class Tetrahedron extends ThreeDimensionalShape{
    public double edge;

    public Tetrahedron(double edge) {
        this.edge = edge;
    }
    @Override
    public double getArea() {      
        return Math.sqrt(3) * edge * edge;
    }
    
    @Override
    public double getVolume() {
        return (1.0 / 12.0) * Math.sqrt(2) * edge * edge * edge;
    }
    
    @Override
    public String toString() {
        return "Hinh tu dien deu, canh = " + edge;
    }
}
