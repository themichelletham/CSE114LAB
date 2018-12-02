package Lab12;

import java.util.Scanner;
public class Lab12_MarkovMatrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double[][] arr = new double[3][3];
        
        // Prompt user to enter 3x3 matrix
        System.out.println("Enter a 3-by-3 matrix row by row:");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = input.nextDouble();
            }
        }
        
        // Display whether matrix is a Markov matrix
        if(isMarkovMatrix(arr)){
            System.out.println("It is a Markov matrix");
        }
        else
            System.out.println("It is not a Markov matrix");
    }
    
    // Method that checks whether the matrix is a Markov matrix
    public static boolean isMarkovMatrix(double[][] m){
        boolean isTrue = true;
        
        // Checks whether there are negative numbers
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(m[i][j] < 0){
                    isTrue = false;
                    break;
                }
            }
        }
        
        int index = 0;
        double[] temp = new double[3];
        
        // Checks whether each column sum to 1
        for(int j = 0; j < m[0].length; j++){
            double sum = 0;
            for(int i = 0; i < m.length; i++){
                sum += m[i][j];
            }
            temp[index] = sum;
            index++;
        }
        
        for(int i = 0; i < temp.length; i++){
            if(temp[i] != 1){
                isTrue = false;
            }
        }
        
        return isTrue;
    }
}
