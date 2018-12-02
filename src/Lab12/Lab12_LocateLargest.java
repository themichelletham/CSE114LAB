package Lab12;

import java.util.Scanner;
public class Lab12_LocateLargest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter num row and col
        System.out.print("Enter the number of rows and columns in the array: ");
        int numRow = input.nextInt();
        int numCol = input.nextInt();
        
        double[][] arr = new double[numRow][numCol];
        
        // Prompt user to enter the array
        System.out.print("Enter the array: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = input.nextDouble();
            }
        }
        
        int[] location = locateLargest(arr);
        
        // Display the largest element location
        System.out.println("The location of the largest element is at (" +
                location[0] + ", " + location[1] + ")");
        
    }
    
    public static int[] locateLargest(double[][] a){
        int loRow = 0;
        int loCol = 0;
        // default largest to the first entry
        double largest = a[loRow][loCol];
        
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                // if the current entry is greater than largest, change largest
                if(largest < a[i][j]){
                    largest = a[i][j];
                    loRow = i;
                    loCol = j;
                }
            }
        }
        
        int[] location = {loRow, loCol};
        return location;
    }
}
