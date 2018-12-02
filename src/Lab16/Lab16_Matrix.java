package Lab16;

public class Lab16_Matrix {
    public static void main(String[] args){
        int[][] matrix = new int[4][4];
        int[] countRow = new int[matrix.length];
        int[] countCol = new int[matrix[0].length];
        int num;
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                num = (int)(Math.random() * 2);
                if(num == 1){
                    countRow[i] += 1;
                    countCol[j] += 1;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
       
        System.out.println("The largest row index: " + getLargest(countRow)); 
        System.out.println("The largest column index: " + getLargest(countCol));
    }
    
    // takes in the array and finds where the largest element is
    // returns index
    public static int getLargest(int[] m){
        int largest = m[0];
        int index = 0;
        
        for(int i = 1; i < m.length; i++){
            if(m[i] > m[0]){
                largest = m[i];
                index = i;
            }
        }
        return index;
    }
}
