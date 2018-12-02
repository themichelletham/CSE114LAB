package Lab18;

import java.util.Scanner;
import java.util.ArrayList;

public class UnionArrayList {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        // Prompt user for list1 elements
        System.out.print("Enter five integers for list1: ");
        for(int i = 0; i < 5; i++){
            list1.add(input.nextInt());
        }
        
        // Prompt user for list2 elements
        System.out.print("Enter five integers for list2: ");
        for(int i = 0; i < 5; i++){
            list2.add(input.nextInt());
        }
        
        for(int i = 0; i < list2.size(); i++){
            list1.add(list2.get(i));
        }
        
        System.out.println("The combined list is: " + list1);
    }
}
