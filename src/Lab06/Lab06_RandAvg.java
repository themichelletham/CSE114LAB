package Lab06;

public class Lab06_RandAvg {
    public static void main(String[] args){
        int sum = 0;
        double average;
        
        //Gathers all the sums of 10 random nums
        for (int counter = 0; counter < 10; counter++){
            sum += (int)(Math.random() * 100);
        }
        
        average = sum / 10;
        
        System.out.println("The average value of 10 random integers is: " + average);
    }
}
