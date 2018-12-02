package Lab17;
import java.util.Scanner;
public class TestTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length of each side of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        
        System.out.print("Enter the color of the triangle: ");
        String color = input.next();
        
        System.out.print("Is this triangle filled (T/F): ");
        boolean filled = input.nextBoolean();
        
        Triangle tri = new Triangle(side1,side2,side3);
        tri.setColor(color);
        tri.setFilled(filled);
        
        System.out.println(tri.toString());
        System.out.println("Area: " + tri.getArea());
        System.out.println("Perimeter: " + tri.getPerimeter());
    }
}
