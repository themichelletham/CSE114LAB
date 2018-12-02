package Lab15;

class RegularPolygon{
    private int n;          // number of sides inn the polygon 
    private double side;    // length of the side
    private double x;       // x-coordinate of the polgyon's center
    private double y ;      // y-coordinate of the polygon's center
    
    // default no-argument constructor
    RegularPolygon(){
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }
    
    // Specified constructor with just num of sides and length (centered at (0,0))
    RegularPolygon(int numSide, double length){
        n = numSide;
        side = length;
        x = 0;
        y = 0;
    }
    
    // Specified constructor with all values
    RegularPolygon(int numSide, double length, double xCoord, double yCoord){
        n = numSide;
        side = length;
        x = xCoord;
        y = yCoord;
    }
    
    // Getters
    public int getN(){
        return n;
    }
    public double getSide(){
        return side;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    
    // Setters
    public void setN(int newN){
        n = newN;
    }
    public void setSide(double newSide){
        side = newSide;
    }
    public void setX(double newX){
        x = newX;
    }
    public void setY(double newY){
        y = newY;
    }
    
    // Method that returns perimeter
    public double getPerimeter(){
        // length of each side * number of sides
        return side * n;
    }
    
    // Method that returns area
    public double getArea(){
        return ((n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n)));
    }
}


public class Lab15_RegularPolygon {
    public static void main(String[] args){
        RegularPolygon poly1 = new RegularPolygon();
        System.out.println("Polygon 1");
        System.out.println("Perimeter: " + poly1.getPerimeter());
        System.out.println("Area: " + poly1.getArea());
        
        System.out.println();
        
        RegularPolygon poly2 = new RegularPolygon(6, 4);
        System.out.println("Polygon 2");
        System.out.println("Perimeter: " + poly2.getPerimeter());
        System.out.println("Area: " + poly2.getArea());
        
        System.out.println();
        
        RegularPolygon poly3 = new RegularPolygon(10, 4, 5.6, 7.8);
         System.out.println("Polygon 3");
        System.out.println("Perimeter: " + poly3.getPerimeter());
        System.out.println("Area: " + poly3.getArea());
    }
}
