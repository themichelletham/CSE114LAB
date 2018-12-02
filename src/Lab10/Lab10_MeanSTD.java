package Lab10;

import java.util.Scanner;
public class Lab10_MeanSTD {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Store inputed numbers into array
        double[] num = new double[10];
        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i < 10; i++){
            num[i] = input.nextDouble();
        }
        
        input.close();
        
        // Display results to user
        System.out.println("The mean is " + mean(num));
        System.out.println("The standard deviation is " + deviation(num));
    }
    
    // Method that computes the mean of the given array
    public static double mean(double[] x){
        double sum = 0;
        double mean;
        
        // Takes in the sum of each entry
        for(int i = 0; i < x.length; i++){
            sum += x[i];
        }
        
        mean = sum / (x.length);
        return mean;
    }
    
    public static double deviation(double[] x){
        double sum = 0;
        double mean = mean(x);
        double std;
        
        for (int i = 0; i < x.length; i++){
            sum += (Math.pow((x[i] - mean), 2)); 
        }
        
        std = Math.sqrt(sum / (x.length - 1));
        return std;
    }
}
