package Lab05;

import java.util.Scanner;
public class Lab05_nPolygon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of sides: ");
        int nSides = input.nextInt();
        
        System.out.print("Enter the length of the side: ");
        double sideLength = input.nextDouble();
        
        double area = (nSides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI/nSides));
        System.out.println("The area of the polygon is " + area);
    }
}
