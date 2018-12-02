package Lab07;

import java.util.Scanner;
public class Lab07_City {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter three cities
        System.out.print("Enter the first city: ");
        String firstCity = input.nextLine();
        
        System.out.print("Enter the second city: ");
        String secondCity = input.nextLine();
        
        System.out.print("Enter the third city: ");
        String thirdCity = input.nextLine();
        
        // the final output when alphabetized
        String output = "";
        
        
            // if first < second < third
            if (firstCity.compareToIgnoreCase(secondCity) < 0 && secondCity.compareToIgnoreCase(thirdCity) < 0){
                output = firstCity + " " + secondCity + " " + thirdCity;
            }
            // if second < third < first
            else if (secondCity.compareToIgnoreCase(thirdCity) < 0 && thirdCity.compareToIgnoreCase(firstCity) < 0)
                output = secondCity + " " + thirdCity + " " + firstCity;
            // if third < first < second
            else if (thirdCity.compareToIgnoreCase(firstCity) < 0 && firstCity.compareToIgnoreCase(secondCity) < 0)
                output = thirdCity + " " + firstCity + " " + secondCity;
            // if first < third < second
            else if (firstCity.compareToIgnoreCase(thirdCity) < 0 && thirdCity.compareToIgnoreCase(secondCity) < 0)
                output = firstCity + " " + thirdCity + " " + secondCity;
            // if second < first < third
            else if(secondCity.compareToIgnoreCase(firstCity) < 0 && firstCity.compareToIgnoreCase(thirdCity) < 0){
                output = secondCity + " " + firstCity + " " + thirdCity;
            }
            // if third < second < first
            else 
                output = thirdCity + " " + secondCity + " " + firstCity;
            
        System.out.println("The three cities in alphabetical order is : " + output);
       
    }
}
