package Lab17;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListChar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the input string: ");
        String str = input.nextLine();
        
        System.out.println("Elements of the Character array list: " +
                toCharacterArray(str));
    }
    
    public static ArrayList<Character> toCharacterArray(String s){
        ArrayList<Character> ch = new ArrayList<Character> ();
        
        for(int i = 0; i < s.length(); i++){
            ch.add(s.charAt(i));
        }
        
        return ch;
    }
}
