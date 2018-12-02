package Lab07;

public class Lab07_PlateNumber {
    public static void main(String[] args){
        String plateNum = "";
        
        // Adds 3 Uppercase letters into plate number
        for (int count = 0; count < 3; count++)
            plateNum += (char)((int)(Math.random() * 26 + 65));
        
        // Adds 4 digits
        for (int count = 0; count < 4; count++)
            plateNum += (char)((int)(Math.random() * 10 + 48));
    
        // Displays the plate number
        System.out.println("Generated Plate Number: " + plateNum);
    }
}
