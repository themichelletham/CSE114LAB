package Lab13;

public class Lab13_TestRectangle {
    public static void main(String[] args){
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);
        
        // Display Rectangle 1
        System.out.println("Rectangle 1");
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());
        
        System.out.println();
        
        // Display Rectangle 2
        System.out.println("Rectangle 2");
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
        
        
    }
    
    static class Rectangle{
        double width;
        double height;
        
        public Rectangle(){
            width = 1;
            height = 1;
        }
        
        public Rectangle(double newWidth, double newHeight){
            width = newWidth;
            height = newHeight;
        }
        
        public double getWidth(){
            return width;
        }
        
        public double getHeight(){
            return height;
        }
        
        public double getArea(){
            return width * height;
        }
        
        public double getPerimeter(){
            return 2 * (width + height);
        }
    }
}
