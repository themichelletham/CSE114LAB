package Lab08;

import java.util.Scanner;
public class Lab08_Encrypt {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an encyrpted message: ");
        String encMessage = input.next();
        
        String message = "";
        int i = 0;
        
        while(i < encMessage.length()){
            message += encMessage.charAt(i);
            i += 2;
        }
        
        System.out.println("The hidden message is: " + message);
    }
}
