package Lab14;

import java.util.Scanner;
public class Lab14_QuadraticEquation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Prompt user for parameters
        System.out.print("Enter a, b, and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        // Create quadraticequation object
        QuadraticEquation q = new QuadraticEquation(a,b,c);
        
        if(q.getDiscriminant() == 0){
            System.out.println("The equation has one root: " + q.getRoot1());
        }
        else if(q.getDiscriminant() > 0){
            System.out.println("The equation has two roots: " + q.getRoot1() +
                    " and " + q.getRoot2());
        }
        else
            System.out.println("The equation has no real roots.");
    }
}

class QuadraticEquation{
    private double a;
    private double b;
    private double c;
    
    public QuadraticEquation(double newA, double newB, double newC){
        a = newA;
        b = newB;
        c = newC;
    }
    
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    
    public double getDiscriminant(){
        return Math.pow(b,2) - 4 * a * c;
    }
    public double getRoot1(){
        if(getDiscriminant() < 0){
            return 0;
        }
        else
            return (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / 2 * a;
    }
    public double getRoot2(){
        if(getDiscriminant() < 0){
            return 0;
        }
        else
            return (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / 2 * a;
    }
}
