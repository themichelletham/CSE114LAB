package Lab11;

import java.util.Scanner;
public class Lab11_mergeSort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter list1 size and contents
        System.out.print("Enter list1 size and contents: ");
        int size1 = input.nextInt();
        int[] list1 = new int [size1];
        for(int i = 0; i < list1.length; i++){
            list1[i] = input.nextInt();
        }
        
        // Prompt user to enter list2 size and contents
        System.out.print("Enter list2 size and contents: ");
        int size2 = input.nextInt();
        int[] list2 = new int [size2];
        for(int i = 0; i < list2.length; i++){
            list2[i] = input.nextInt();
        }
        
        // Displays sorted lists
        System.out.print("List1 is ");
        for(int i = 0; i < list1.length; i++){
            System.out.print(list1[i] + " ");
        }
        System.out.println();
        
        System.out.print("List2 is ");
        for(int i = 0; i < list2.length; i++){
            System.out.print(list2[i] + " ");
        }
        System.out.println();
        
        // merge lists
        int[] mergedList = merge(list1, list2);
        mergedList = sort(mergedList);
        
        // Displays merged list
        System.out.print("The merged list is ");
        for(int i = 0; i < mergedList.length; i++){
            System.out.print(mergedList[i] + " ");
        }
        System.out.println();
    }
    
    // Method that bubble sorts array
    public static int[] sort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    
    // Method that merges two arrays
    public static int[] merge(int[] list1, int[] list2){
        int[] merged = new int [list1.length + list2.length];
        
        for(int i = 0; i < list1.length; i++){
            merged[i] = list1[i];
        }
        int j = 0;
        for(int i = list1.length; i < (list1.length + list2.length); i++){
            merged[i] = list2[j];
            j++;
        }
        return merged;
    }
}
