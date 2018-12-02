package Lab10;

import java.util.Scanner;
public class Lab10_Duplicate {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] num = new int[10];
        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i < num.length; i++){
            num[i] = input.nextInt();
        }
        
        // Calls method
        int [] newList = eliminateDuplicate(num);
        
        // Displays new array
        System.out.print("The distinct numbers are: ");
        System.out.print(newList[0] + " ");
        for(int i = 1; i < newList.length; i++){
            if(newList[i] != 0 && newList[i + 1] != 0)
                System.out.print(newList[i] + " ");
        }
        System.out.println();
    }
    
    // Method that eliminates duplicates into a new array
    public static int[] eliminateDuplicate(int[] list){
        int[] newList = new int[list.length]; // Same size array
        int i = 0; // newList index
        for(int x = 0; x < list.length; x++){
            // checks if the element in the array is list previously
            if(search(newList, list[x]) == -1){
                newList[i] = list[x];
                i++; //increment newList index
            }
        }
        
        return newList;
    }
    
    // Additional array to search if the element value is in the array
    public static int search(int[] array, int num){
        for(int i = 0; i < array.length; i++){
            if(num == array[i])
                return i;
        }
        return -1;
    }
}
