package Lab20;
import java.util.*;
public class ArrayIndexOutOfBounds {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] a = new int[100];
        
        // Assigns a random integer in each index of the array
        for(int i = 0; i < a.length; i++){
            a[i] = (int) (Math.random() * (100 - 1 + 1)) + 1; // Range: max - min + 1
        }
        
        boolean isValid = false;
        int index = 0;
        int num = 0;
        
        // Prompt user to enter index
        System.out.print("Enter an index of the array: ");
        do{
            try{
                index = input.nextInt();
                num = a[index];
                isValid = true;
            }
            catch (ArrayIndexOutOfBoundsException ex){
                input.nextLine();
                System.out.println("Incorrect input. Index within the array " + 
                        " is required (1-100).");
                System.out.print("Enter an index of the array: ");
            }
        } while(!isValid);
        
        System.out.println("The corresponding value of index " + index +
                " is " + num);
    }
}
