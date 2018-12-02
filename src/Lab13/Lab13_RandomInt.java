package Lab13;

public class Lab13_RandomInt {
    public static void main(String[] args){
        // Generates 100 random integers
        int[] num = new int[100];
        for(int i = 0; i < num.length; i++){
            num[i] = (int)(Math.random() * 10);
        }
        
        // Each random number is counted in the corresponding index
        int[] count = new int[10];
        for(int i = 0; i < num.length; i++){
            count[num[i]]++;
        }
        
        // Display the count
        for(int i = 0; i < count.length; i++){
            System.out.println(i + " : " + count[i]);
        }
    }
}
