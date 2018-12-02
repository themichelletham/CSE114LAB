package Lab09;

import java.util.Scanner;
public class Lab09_charOccurence {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Prompt user for string
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        // Prompt user for character
        System.out.print("Enter a character: ");
        char a = input.next().charAt(0);
        
        // Calls method for count of occurences of char in String to display
        System.out.println("The number of times character " + a + " appears in String " +
                str + " is " + count(str, a) + " times.");
        
    }
    
    public static int count(String str, char a){
        int count = 0;
        
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == a){
                count++;
            }
        }
        
        return count;
    }
}
