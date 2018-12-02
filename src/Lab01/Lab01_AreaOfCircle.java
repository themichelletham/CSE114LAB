package Lab01;

import java.util.Scanner;
public class Lab01_AreaOfCircle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        double radius;
        double area;
        
        System.out.print("Enter a radius: ");
        radius = input.nextDouble();
        
        area = Math.PI * Math.pow(radius, 2);
        
        System.out.println("The area of the circle with radius of " + radius +
                " is " + area);
        input.close();
    }
}