package Lab05;

import java.util.Scanner;
public class Lab05_Factorial {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        
        input.close();
        int factorial = 1;
        int counter;
        // Loops down the num to be multiplied to find factorial
        for (counter = num; counter > 0; counter--){
            factorial *= counter;
        }
        
        System.out.println("Factorial is: " + factorial);
    }
}
