package Lab06;

public class Lab06_e {
    public static void main(String[] args){
        double e = 1 ;
        int factorial = 1;
        int k = 10;
        int count = 1;
        
        while(count <= k){
                factorial *= (k - (k - count));
                count++;
                e += 1.0 / (factorial);
            
            System.out.println("Approximation of e when k = " + (count - 1) + " is " + e);
        }
    }
}
