package Lab18;

import java.util.Scanner;
import java.util.ArrayList;

public class SortArrayList {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        String temp;
        
        // Prompt user for List1
        System.out.println("Enter the elements in List1 "
                + "(Enter \"exit\" when finished): ");
        do{
            temp = input.nextLine();
            if(!(temp.equals("exit"))){
                list1.add(temp);
            }
        }while(!temp.equals("exit"));
        
        // Display list1
        System.out.println(list1);
        System.out.println();
        
        // Prompt user for List1
        System.out.println("Enter the elements in List2 "
                + "(Enter \"exit\" when finished): ");
        do{
            temp = input.nextLine();
            if(!(temp.equals("exit"))){
                list2.add(temp);
            }
        }while(!temp.equals("exit"));
        
        // Display list2
        System.out.println(list2);
        System.out.println();
        
        //Display merged ArrayList
        System.out.println("The merged sorted list is " + mergeList(list1,list2));
    }
    
    public static ArrayList<String> mergeList(ArrayList<String> lst1,
            ArrayList<String> lst2){
        
        for(int i = 0; i < lst2.size(); i++){
            lst1.add(lst2.get(i));
        }
        
        // Sort ArrayList
        for(int i = 0; i < lst1.size(); i++){
            for(int j = 0; j < lst1.size() - i - 1; j++){
                if(lst1.get(j).compareToIgnoreCase(lst1.get(j+1)) > 0){
                    String temp = lst1.get(j);
                    lst1.set(j,lst1.get(j+1));
                    lst1.set(j+1, temp);
                }
            }
        }
        
        return lst1;
    }
}
