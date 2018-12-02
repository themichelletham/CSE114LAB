package Lab08;

import java.util.Scanner;
public class Lab08_Vertical {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a message: ");
        String message = input.nextLine();
        
        for(int i = 0; i < message.length(); i++){
            System.out.println(message.charAt(i));
        }
    }
}
