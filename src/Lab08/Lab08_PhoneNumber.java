package Lab08;

import java.util.Scanner;
public class Lab08_PhoneNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the phone number: ");
        String pNum = input.next();
        
        String formNum = "(" + pNum.substring(0,3) + ")" + pNum.substring(3,6) +
                "-" + pNum.substring(6);
        
        System.out.println("Formatted phone number: " + formNum);
    }
}
