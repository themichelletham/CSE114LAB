package Lab01;

import java.util.Scanner;
public class Lab01_VolumeOfPrism {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double length, width, height, volume;
        
        System.out.print("Enter a length: ");
        length = input.nextDouble();
        System.out.print("Enter a width: ");
        width = input.nextDouble();
        System.out.print("Enter a height: ");
        height = input.nextDouble();
        
        volume = length * width * height;
        
        System.out.println("The volume is " + volume);
                
        input.close();
    }
}