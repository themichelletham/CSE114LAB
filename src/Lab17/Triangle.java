package Lab17;

public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;
    
    Triangle(){
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }
    
    Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public double getSide1(){
        return side1;
    }
    
    public double getSide2(){
        return side2;
    }
    
    public double getSide3(){
        return side3;
    }
    
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    
    public double getArea(){
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
    }
    
    @Override
    public String toString(){
        return "Triangle:side1 = " + side1 + " side2 = " + 
                side2 + " side3 = " + side3 + super.toString();
    }
}
