package Lab16;

import java.util.Scanner;
class LinearEquation{
    // data memebers
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    
    LinearEquation(double A, double B, double C, double D, double E, double F){
        a = A;
        b = B;
        c = C;
        d = D;
        e = E;
        f = F;
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
    public double getD(){
        return d;
    }
    public double getE(){
        return e;
    }
    public double getF(){
        return f;
    }
    
    public double getX(){
        return (e * d - b * f) / (a * d - b * c);
    }
    
    public double getY(){
        return (a * f - e * c) / (a * d - b * c);
    }
    
    public boolean isSolvable(){
        if((a * d - b * c) == 0){
            return false;
        }
        else
            return true;
    }
}
public class Lab16_LinearEq {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        
        LinearEquation lin = new LinearEquation(a,b,c,d,e,f);
        
        if(lin.isSolvable()){
            System.out.println("X is " + lin.getX() + " and Y is " + lin.getY());
        }
        else
            System.out.println("The equation has no solutions.");
    }
}
