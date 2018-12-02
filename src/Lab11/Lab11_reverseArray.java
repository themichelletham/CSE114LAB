package Lab11;

import java.util.Scanner;
public class Lab11_reverseArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter 10 numbers
        System.out.print("Enter 10 numbers: ");
        double[] array = new double[10];
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextDouble();
        }
        
        array = reverse(array);
        
        System.out.print("Reverse: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    // Method that reverses the array (not using a temp array)
    public static double[] reverse(double[] array){
        // Switches the last with the first
        for(int i = 0; i < array.length / 2; i++){
            double temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
            
        }
        return array;
    }
}
