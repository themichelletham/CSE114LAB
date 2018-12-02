package Lab20;
import java.util.*;
public class InputMismatchEx {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean isValid = false;
        
        // Prompt user to enter two integers
        System.out.print("Enter two integers: ");
        int num1 = 0;
        int num2 = 0;
        int sum;
        
        do{
            try{
                // May encounter an exception if not Int
                num1 = input.nextInt();
                num2 = input.nextInt();
                isValid = true;
            }
            // Asking for an Int (if not --> InputMismatch)
            catch(InputMismatchException ex){
                input.nextLine(); // Breaks the infinite loop
                System.out.println("Incorrect input. Integer is required.");
                // Again, prompt user to enter (loops if invalid)
                System.out.print("Enter two integers: ");
            }
        } while(!isValid);
        
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
