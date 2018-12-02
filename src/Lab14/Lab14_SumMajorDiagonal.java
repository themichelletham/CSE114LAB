package Lab14;

import java.util.Scanner;
public class Lab14_SumMajorDiagonal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double[][] m = new double[4][4];
        
        // Prompt user to enter 4x4 matrix and enter it in a 2D array
        System.out.println("Enter a 4x4 matrix:");
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = input.nextDouble();
            }
        }
        
        // Display sum of the main diagonal by calling method
        System.out.println("The sum of the major diagonal is " + sumMajorDiagonal(m));
    }
    
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(i == j){
                    sum += m[i][j];
                }
            }
        }
        
        return sum;
    }
}

