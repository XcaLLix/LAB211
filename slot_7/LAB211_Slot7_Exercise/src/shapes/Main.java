/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author dinhh
 */
public class Main {
    public static void main(String[] args) {
        
        Shapes[] shapes = new Shapes[6];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Square(4.0);
  
        shapes[3] = new Sphere(3.0);
   
        shapes[5] = new Tetrahedron(6.0);


        System.out.println("--- Xu ly mang cac hinh dang ---");

        for (Shapes shape : shapes) {

            System.out.println("\nDoi Tuong Tham Chieu: " + shape);

           
            if (shape instanceof TwoDimensionalShape) {
               
                TwoDimensionalShape twoD = (TwoDimensionalShape) shape;
                System.out.printf("Loai: 2D dien tich = %.2f\n", twoD.getArea());

            } else if (shape instanceof ThreeDimensionalShape) {
              
                ThreeDimensionalShape threeD = (ThreeDimensionalShape) shape;
                System.out.printf("Loai: Hinh 3D dien tich be mat = %.2f\n", threeD.getArea());
                System.out.printf("The tich = %.2f\n", threeD.getVolume());
            } else {
                System.out.println("Loai: Hinh dang khong xac dinh.");
            }
        }
        System.out.println("---------------------------------");
    }
}
