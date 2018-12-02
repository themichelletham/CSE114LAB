package Lab09;

public class Lab09_Summation {
    public static void main(String[] args){
        // Format table
        System.out.println("i\tm(i)");
        
        // Initialize sum variable
        double sum = 0;
        
        // Conducts and displays the sum
        for (int i = 1; i <= 20; i++){
            System.out.print(i + "\t");
            sum += i / (i + 1.0);
            System.out.println(sum);
        }
    }
}
